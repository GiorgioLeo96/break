package com.digitazon.breakhotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.digitazon.breakhotel.model.Appartamento;
import com.digitazon.breakhotel.model.AppartamentoImg;
import com.digitazon.breakhotel.service.AppartamentoImgService;
import com.digitazon.breakhotel.service.AppartamentoService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class BreakDataLoader implements CommandLineRunner {

    @Autowired
    AppartamentoService appartamentoService;

    @Autowired
    AppartamentoImgService appartamentoImgService;

    @Override
    public void run(String... args) throws Exception {
        log.warn("Runner start");

        Appartamento app1tmp = new Appartamento("Lombardia", "Milano", 1, 1, 1, 235, true, false, null);
        Appartamento app2tmp = new Appartamento("Veneto", "Venezia", 2, 1, 2, 120, false, true, null);
        Appartamento app3tmp = new Appartamento("Emilia-Romania", "Bologna", 3, 2, 3, 130, true, true, null);
        Appartamento app4tmp = new Appartamento("Umbria", "Perugia", 1, 1, 1, 321, true, false, null);
        Appartamento app5tmp = new Appartamento("Lazio", "Roma", 3, 2, 3, 255, false, true, null);
        Appartamento app6tmp = new Appartamento("Abruzzo", "L'Acquila", 2, 1, 2, 293, true, true, null);

        Appartamento app1 = appartamentoService.save(app1tmp);
        Appartamento app2 = appartamentoService.save(app2tmp);
        Appartamento app3 = appartamentoService.save(app3tmp);
        Appartamento app4 = appartamentoService.save(app4tmp);
        Appartamento app5 = appartamentoService.save(app5tmp);
        Appartamento app6 = appartamentoService.save(app6tmp);

        AppartamentoImg app1Img1 = new AppartamentoImg(app1, "immagini/casa1/esterno.jpg");
        AppartamentoImg app1Img2 = new AppartamentoImg(app1, "immagini/casa1/cucina.jpg");
        AppartamentoImg app1Img3 = new AppartamentoImg(app1, "immagini/casa1/salotto.jpg");
        AppartamentoImg app1Img4 = new AppartamentoImg(app1, "immagini/casa1/salotto2.jpg");

        appartamentoImgService.save(app1Img1);
        appartamentoImgService.save(app1Img2);
        appartamentoImgService.save(app1Img3);
        appartamentoImgService.save(app1Img4);

        System.out.println("sono arrivato qui!");
    }
}
