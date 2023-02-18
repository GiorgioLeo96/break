package com.digitazon.breakhotel.model;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Prenotazione {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate checkIn;

    private LocalDate checkOut;

    @ManyToOne
    private Utente utente;

    @ManyToOne
    private Appartamento appartamento;

    @Transient
    private double totale;

    public double getTotale() {
        Period period = Period.between(checkIn, checkOut);
        int totalDays = period.getDays();
        return totalDays * appartamento.getPrezzo();
    }

    public Prenotazione(LocalDate checkIn, LocalDate checkOut, Utente utente, Appartamento appartamento) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.utente = utente;
        this.appartamento = appartamento;
    }

    public Prenotazione(LocalDate checkIn, LocalDate checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

}
