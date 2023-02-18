package com.digitazon.breakhotel.controller;

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
import com.digitazon.breakhotel.service.AppartamentoService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/appartamento")
@Slf4j
@CrossOrigin
public class AppartamentoController {

    @Autowired
    AppartamentoService appartamentoService;

    @GetMapping("/all")
    public ResponseEntity<List<Appartamento>> findAllAppartamento(
            @RequestParam(name = "regione", required = false) String regione,
            @RequestParam(name = "citta", required = false) String citta) {
        log.info("chiamata al findAllAppartamenti");

        if (regione != null || citta != null) {
            return new ResponseEntity<>(appartamentoService.getAppartamentoByRegioneAndCitta(regione, citta),
                    HttpStatus.OK);
        }

        return new ResponseEntity<>(appartamentoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{appID}")
    public ResponseEntity<Appartamento> findbyid(@PathVariable Long appID) {
        return new ResponseEntity<>(appartamentoService.findByID(appID), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{appID}")
    public ResponseEntity<String> deleteAppartamentiById(@PathVariable Long appID) {
        log.info("chiamata al findAllAppartamenti");
        appartamentoService.deleteByID(appID);
        return new ResponseEntity<>("Cancellato con successo", HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Appartamento> createAppartamento(@RequestBody Appartamento appartamento) {

        log.info("Chiamata create appartamento" + appartamento.toString());

        Appartamento a = appartamentoService.save(appartamento);

        return new ResponseEntity<>(a, HttpStatus.CREATED);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Appartamento> updateAppartamento(@PathVariable Long id,
            @RequestBody Appartamento appartamento) {
        log.info("chiamata create appartamento" + appartamento.toString());

        return new ResponseEntity<>(appartamentoService.update(id, appartamento), HttpStatus.OK);
    }
}
