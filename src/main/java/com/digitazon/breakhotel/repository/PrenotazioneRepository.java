package com.digitazon.breakhotel.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.digitazon.breakhotel.model.Appartamento;
import com.digitazon.breakhotel.model.Prenotazione;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {

    @Query("SELECT p FROM Prenotazione p WHERE p.appartamento = :appartamento AND p.checkIn <= :checkOut AND p.checkOut >= :checkIn")
    public List<Prenotazione> findAllByAppartamento(@Param("appartamento") Appartamento appartamento,
            @Param("checkIn") LocalDate checkIn, @Param("checkOut") LocalDate checkOut);
}
