package com.digitazon.breakhotel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitazon.breakhotel.model.Prenotazione;
import com.digitazon.breakhotel.repository.PrenotazioneRepository;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

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
