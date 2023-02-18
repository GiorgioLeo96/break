package com.digitazon.breakhotel.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitazon.breakhotel.model.Appartamento;
import com.digitazon.breakhotel.model.Prenotazione;
import com.digitazon.breakhotel.model.Utente;
import com.digitazon.breakhotel.service.AppartamentoService;
import com.digitazon.breakhotel.service.PrenotazioneService;
import com.digitazon.breakhotel.service.UtenteService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/prenotazione")
@CrossOrigin
public class PrenotazioneController {

    @Autowired
    PrenotazioneService prenotazioneService;

    @Autowired
    UtenteService utenteService;

    @Autowired
    AppartamentoService appartamentoService;

    @GetMapping("/all")
    public ResponseEntity<List<Prenotazione>> findAllPrenotazione() {
        log.info("chiamata al findAllPrenotazione");
        return new ResponseEntity<>(prenotazioneService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/prezzo{appartamentoId}")
    public double getPrezzo(
            @RequestParam("checkin") String checkin,
            @RequestParam("checkout") String checkout,
            @PathVariable Long appartamentoId) {

        LocalDate checkIn = LocalDate.parse(checkin);
        LocalDate checkOut = LocalDate.parse(checkout);

        Prenotazione prenotazione = new Prenotazione(checkIn, checkOut);
        return prenotazione.getTotale();
    }

    @GetMapping("id/{id}")
    public ResponseEntity<Prenotazione> findById(@PathVariable Long id) {
        log.info("chiamata al findPrenotazioneId");
        return new ResponseEntity<>(prenotazioneService.findByID(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{preID}")
    public ResponseEntity<String> deletePrenotazioneById(@PathVariable Long uteID) {
        log.info("chiamata al findAllPrenotazione");
        prenotazioneService.deleteByID(uteID);
        return new ResponseEntity<>("Cancellato con successo", HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Prenotazione> updatePrenotazione(@PathVariable Long id,
            @RequestBody Prenotazione prenotazione) {
        log.info("chiamata create prenotazione" + prenotazione.toString());

        return new ResponseEntity<>(prenotazioneService.update(id, prenotazione), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createPrenotazione(@RequestBody Prenotazione prenotazione) {

        log.info("Chiamata create Prenotazione" + prenotazione.toString());
        Utente ut = utenteService.findByEmail(prenotazione.getUtente().getEmail());

        if (ut == null) {
            ut = utenteService.save(prenotazione.getUtente());
        }
        Appartamento app = appartamentoService.findByID(prenotazione.getAppartamento().getId());

        if (app != null) {
            prenotazione.setAppartamento(app);
            prenotazione.setUtente(ut);
            Prenotazione p = prenotazioneService.save(prenotazione);

            return new ResponseEntity<>(p, HttpStatus.CREATED);
        }
        return new ResponseEntity<>("appartamento non trovato", HttpStatus.BAD_REQUEST);

    }

}
