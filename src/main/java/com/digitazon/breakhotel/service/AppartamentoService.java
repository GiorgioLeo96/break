package com.digitazon.breakhotel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitazon.breakhotel.model.Appartamento;
import com.digitazon.breakhotel.repository.AppartamentoRepository;

@Service
public class AppartamentoService {

    @Autowired
    private AppartamentoRepository appartamentoRepository;

    public List<Appartamento> findAll() {
        return appartamentoRepository.findAll();
    }

    public Appartamento findByID(Long id) {
        Optional<Appartamento> appOpt = appartamentoRepository.findById(id);

        if (appOpt.isPresent())
            return appOpt.get();

        return null;
    }

    public Appartamento save(Appartamento appartamento) {
        return appartamentoRepository.save(appartamento);
    }

    public void deleteByID(Long id) {
        appartamentoRepository.deleteById(id);
    }

    public Appartamento update(Long id, Appartamento newApp) {
        Appartamento oldApp = findByID(id);

        if (oldApp == null)
            return null;

        oldApp.setRegione(newApp.getRegione());
        oldApp.setCitta(newApp.getCitta());
        oldApp.setBagni(newApp.getBagni());
        oldApp.setLetto(newApp.getLetto());
        oldApp.setOspitiStruttura(newApp.getOspitiStruttura());
        oldApp.setPrezzo(newApp.getPrezzo());
        oldApp.setColazione(newApp.isColazione());
        oldApp.setRiscaldamento(newApp.isRiscaldamento());

        return appartamentoRepository.save(oldApp);
    }

    public List<Appartamento> getAppartamentoByRegione(String regione) {
        return appartamentoRepository.findAllByRegione(regione);
    }

    public List<Appartamento> getAppartamentoByCitta(String citta) {
        return appartamentoRepository.findAllByCitta(citta);
    }

    public List<Appartamento> getAppartamentoByRegioneAndCitta(String regione, String citta) {
        return appartamentoRepository.findAllByRegioneByCitta(regione, citta);
    }
}
