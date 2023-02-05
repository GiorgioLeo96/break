package com.digitazon.breakhotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitazon.breakhotel.model.Prenotazione;
import com.digitazon.breakhotel.service.PrenotazioneService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/prenotazione")
public class PrenotazioneController {

    @Autowired
    PrenotazioneService prenotazioneService;

    @GetMapping("/all")
    public ResponseEntity<List<Prenotazione>> findAllPrenotazione() {
        log.info("chiamata al findAllPrenotazione");
        return new ResponseEntity<>(prenotazioneService.findAll(), HttpStatus.OK);
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
}
