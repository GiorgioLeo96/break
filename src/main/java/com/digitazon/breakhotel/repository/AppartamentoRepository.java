package com.digitazon.breakhotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitazon.breakhotel.model.Appartamento;

public interface AppartamentoRepository extends JpaRepository<Appartamento, Long> {

    public Appartamento findAppartamentoByRegione(String regione);

    public Appartamento findAppartamentoByCitta(String citta);

    public List<Appartamento> findAllByRegioneAndCitta(String citta, String regione);
}
