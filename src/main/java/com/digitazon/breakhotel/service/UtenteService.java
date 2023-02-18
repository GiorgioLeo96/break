package com.digitazon.breakhotel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitazon.breakhotel.model.Utente;
import com.digitazon.breakhotel.repository.UtenteRepository;

@Service
public class UtenteService {

    @Autowired
    private UtenteRepository utenteRepository;

    public List<Utente> findAll() {
        return utenteRepository.findAll();
    }

    public Utente findByID(Long id) {
        Optional<Utente> uteOpt = utenteRepository.findById(id);

        if (uteOpt.isPresent())
            return uteOpt.get();

        return null;
    }

    public Utente save(Utente utente) {
        return utenteRepository.save(utente);
    }

    public void deleteByID(Long id) {
        utenteRepository.deleteById(id);
    }

    public Utente update(Long id, Utente newUte) {
        Utente oldUte = findByID(id);

        if (oldUte == null)
            return null;

        oldUte.setNome(newUte.getNome());
        oldUte.setCognome(newUte.getCognome());
        oldUte.setEmail(newUte.getEmail());
        oldUte.setNumeroCartaDiCredito(newUte.getNumeroCartaDiCredito());

        return utenteRepository.save(oldUte);
    }

    public Utente findByEmail(String email) {

        Optional<Utente> uteOpt = utenteRepository.findByEmail(email);

        if (uteOpt.isPresent())
            return uteOpt.get();

        return null;

    }

}
