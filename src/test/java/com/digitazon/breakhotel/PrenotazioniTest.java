package com.digitazon.breakhotel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.digitazon.breakhotel.model.Appartamento;
import com.digitazon.breakhotel.model.Prenotazione;
import com.digitazon.breakhotel.model.Utente;
import com.digitazon.breakhotel.service.AppartamentoService;
import com.digitazon.breakhotel.service.PrenotazioneService;
import com.digitazon.breakhotel.service.UtenteService;

@SpringBootTest
public class PrenotazioniTest {

    @Autowired
    private AppartamentoService appartamentoService;

    @Autowired
    private UtenteService utenteService;

    @Autowired
    private PrenotazioneService prenotazioneService;

    @Test
    public void pagamento() {

        Utente ute1temp = new Utente("Edipio", "Rossi", "EdipioRossi@Hotmail.com");

        Utente ute1 = utenteService.save(ute1temp);

        Appartamento app1temp = new Appartamento("Lombardia", "Milano", 1, 1, 1, 235, true, false, null);

        Appartamento app1 = appartamentoService.save(app1temp);

        Prenotazione pre1temp = new Prenotazione(LocalDate.now(), LocalDate.now().plusDays(2), ute1, app1);

        Prenotazione pre1 = prenotazioneService.save(pre1temp);

        assertNotNull(pre1);

        assertEquals(pre1.getTotale(), 470);
    }

}
