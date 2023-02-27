package com.digitazon.breakhotel.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitazon.breakhotel.model.Appartamento;
import com.digitazon.breakhotel.model.Prenotazione;
import com.digitazon.breakhotel.repository.PrenotazioneRepository;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @Autowired
    private AppartamentoService appartamentoService;

    public List<Prenotazione> findAll() {
        return prenotazioneRepository.findAll();
    }

    public Prenotazione save(Prenotazione prenotazione) {
        return prenotazioneRepository.save(prenotazione);
    }

    public Prenotazione findByID(Long id) {
        Optional<Prenotazione> preOpt = prenotazioneRepository.findById(id);

        if (preOpt.isPresent())
            return preOpt.get();

        return null;
    }

    public void deleteByID(Long id) {
        prenotazioneRepository.deleteById(id);
    }

    public List<Prenotazione> findAllByAppartamento(Long appID, LocalDate checkIn, LocalDate checkOut) {
        Appartamento app = appartamentoService.findByID(appID);
        return prenotazioneRepository.findAllByAppartamento(app, checkIn, checkOut);
    }

    public Prenotazione update(Long id, Prenotazione newPre) {
        Prenotazione oldPre = findByID(id);

        if (oldPre == null)
            return null;

        oldPre.setCheckIn(newPre.getCheckIn());
        oldPre.setCheckOut(newPre.getCheckOut());
        oldPre.setUtente(newPre.getUtente());
        oldPre.setTotale(newPre.getTotale());

        return prenotazioneRepository.save(oldPre);
    }
}
