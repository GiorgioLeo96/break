package com.digitazon.breakhotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.digitazon.breakhotel.model.Appartamento;

public interface AppartamentoRepository extends JpaRepository<Appartamento, Long> {

    public List<Appartamento> findAllByRegione(String regione);

    public List<Appartamento> findAllByCitta(String citta);

    @Query("SELECT a FROM Appartamento a WHERE a.regione LIKE %:regione% AND a.citta LIKE %:citta%")
    public List<Appartamento> findAllByRegioneByCitta(@Param("regione") String regione, @Param("citta") String citta);

}
