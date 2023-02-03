package com.digitazon.breakhotel.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Appartamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String regione;

    private String citta;

    private int ospitiStruttura;

    private int bagni;

    private int letto;

    private double prezzo;

    private boolean colazione;

    private boolean riscaldamento;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "appartamento")
    private List<AppartamentoImg> immagini;

    public Appartamento(String regione, String citta, int ospitiStruttura, int bagni, int letto, double prezzo,
            boolean colazione, boolean riscaldamento, List<AppartamentoImg> immagini) {
        this.regione = regione;
        this.citta = citta;
        this.ospitiStruttura = ospitiStruttura;
        this.bagni = bagni;
        this.letto = letto;
        this.prezzo = prezzo;
        this.colazione = colazione;
        this.riscaldamento = riscaldamento;
        this.immagini = immagini;
    }

}
