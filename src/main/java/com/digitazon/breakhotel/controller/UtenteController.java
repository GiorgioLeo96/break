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

import com.digitazon.breakhotel.model.Utente;
import com.digitazon.breakhotel.service.UtenteService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/utente")
@Slf4j
public class UtenteController {

    @Autowired
    UtenteService utenteService;

    @GetMapping("/all")
    public ResponseEntity<List<Utente>> findAllUtente() {
        log.info("chiamata al findAllUtente");
        return new ResponseEntity<>(utenteService.findAll(), HttpStatus.OK);
    }

    @GetMapping("id/{id}")
    public ResponseEntity<Utente> findById(@PathVariable Long id) {
        log.info("chiamata al findUtenteId");
        return new ResponseEntity<>(utenteService.findByID(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{uteID}")
    public ResponseEntity<String> deleteUtenteById(@PathVariable Long uteID) {
        log.info("chiamata al findAllUtente");
        utenteService.deleteByID(uteID);
        return new ResponseEntity<>("Cancellato con successo", HttpStatus.OK);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Utente> updateUtente(@PathVariable Long id,
            @RequestBody Utente utente) {
        log.info("chiamata create utente" + utente.toString());

        return new ResponseEntity<>(utenteService.update(id, utente), HttpStatus.OK);
    }
}
