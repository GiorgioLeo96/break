package com.digitazon.breakhotel.model;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class AppartamentoImg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JsonIncludeProperties("id")
    private Appartamento appartamento;

    private String immagine;

    public AppartamentoImg(Appartamento appartamento, String immagine) {
        this.appartamento = appartamento;
        this.immagine = immagine;
    }

}
