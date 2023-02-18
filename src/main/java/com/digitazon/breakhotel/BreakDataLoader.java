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

        Appartamento app1tmp = new Appartamento("Lombardia", "Milano", 1, 1, 2, 235, true, true, null);
        Appartamento app2tmp = new Appartamento("Veneto", "Venezia", 2, 1, 2, 120, false, true, null);
        Appartamento app3tmp = new Appartamento("Sicilia", "Palermo", 2, 1, 1, 130, true, false, null);
        Appartamento app4tmp = new Appartamento("Piemonte", "Torino", 2, 1, 1, 111, true, false, null);
        Appartamento app5tmp = new Appartamento("Lazio", "Roma", 2, 1, 2, 255, false, true, null);
        Appartamento app6tmp = new Appartamento("Abruzzo", "L'Acquila", 2, 1, 2, 293, true, true, null);
        Appartamento app7tmp = new Appartamento("Sardegna", "Cagliari", 2, 1, 1, 235, true, false, null);
        Appartamento app8tmp = new Appartamento("Toscana", "Firenze", 2, 1, 1, 156, false, true, null);
        Appartamento app9tmp = new Appartamento("Emilia-Romagna", "Bologna", 2, 1, 1, 130, true, true, null);
        Appartamento app10tmp = new Appartamento("Umbria", "Perugia", 2, 1, 1, 321, true, false, null);
        Appartamento app11tmp = new Appartamento("Valle D'Aosta", "Aosta", 1, 2, 1, 255, false, true, null);
        Appartamento app12tmp = new Appartamento("Trentino-Alto Adige", "Trento", 4, 2, 2, 293, true, true, null);
        Appartamento app13tmp = new Appartamento("Marche", "Ancona", 2, 1, 1, 235, true, false, null);
        Appartamento app14tmp = new Appartamento("Molise", "Campobasso", 4, 1, 2, 120, false, true, null);
        Appartamento app15tmp = new Appartamento("Friuli Venezia Giulia", "Udine", 3, 2, 2, 130, true, true, null);
        Appartamento app16tmp = new Appartamento("Liguria", "Genova", 1, 1, 1, 321, true, false, null);
        Appartamento app17tmp = new Appartamento("Valle D'Aosta", "Aosta", 1, 1, 1, 255, false, true, null);
        Appartamento app18tmp = new Appartamento("Campania", "Napoli", 1, 1, 1, 293, true, true, null);
        Appartamento app19tmp = new Appartamento("Puglia", "Bari", 1, 1, 1, 235, true, false, null);
        Appartamento app20tmp = new Appartamento("Basilicata", "Potenza", 2, 1, 1, 120, false, true, null);
        Appartamento app21tmp = new Appartamento("Calabria", "Catanzaro", 1, 1, 1, 130, true, true, null);
        Appartamento app22tmp = new Appartamento("Sardegna", "Cagliari", 4, 1, 2, 321, true, false, null);
        Appartamento app23tmp = new Appartamento("Sicilia", "Palermo", 1, 1, 1, 255, false, true, null);
        Appartamento app24tmp = new Appartamento("Campania", "Napoli", 1, 1, 2, 293, true, true, null);
        Appartamento app25tmp = new Appartamento("Lazio", "Roma", 1, 1, 2, 293, true, true, null);
        Appartamento app26tmp = new Appartamento("Piemonte", "Torino", 2, 1, 2, 293, true, true, null);

        Appartamento app1 = appartamentoService.save(app1tmp);
        Appartamento app2 = appartamentoService.save(app2tmp);
        Appartamento app3 = appartamentoService.save(app3tmp);
        Appartamento app4 = appartamentoService.save(app4tmp);
        Appartamento app5 = appartamentoService.save(app5tmp);
        Appartamento app6 = appartamentoService.save(app6tmp);
        Appartamento app7 = appartamentoService.save(app7tmp);
        Appartamento app8 = appartamentoService.save(app8tmp);
        Appartamento app9 = appartamentoService.save(app9tmp);
        Appartamento app10 = appartamentoService.save(app10tmp);
        Appartamento app11 = appartamentoService.save(app11tmp);
        Appartamento app12 = appartamentoService.save(app12tmp);
        Appartamento app13 = appartamentoService.save(app13tmp);
        Appartamento app14 = appartamentoService.save(app14tmp);
        Appartamento app15 = appartamentoService.save(app15tmp);
        Appartamento app16 = appartamentoService.save(app16tmp);
        Appartamento app17 = appartamentoService.save(app17tmp);
        Appartamento app18 = appartamentoService.save(app18tmp);
        Appartamento app19 = appartamentoService.save(app19tmp);
        Appartamento app20 = appartamentoService.save(app20tmp);
        Appartamento app21 = appartamentoService.save(app21tmp);
        Appartamento app22 = appartamentoService.save(app22tmp);
        Appartamento app23 = appartamentoService.save(app23tmp);
        Appartamento app24 = appartamentoService.save(app24tmp);
        Appartamento app25 = appartamentoService.save(app25tmp);
        Appartamento app26 = appartamentoService.save(app26tmp);

        AppartamentoImg app1Img1 = new AppartamentoImg(app1, "immagini/casa1/esterno.jpg");
        AppartamentoImg app1Img2 = new AppartamentoImg(app1, "immagini/casa1/cucina.jpg");
        AppartamentoImg app1Img3 = new AppartamentoImg(app1, "immagini/casa1/salotto.jpg");
        AppartamentoImg app1Img4 = new AppartamentoImg(app1, "immagini/casa1/salotto2.jpg");
        AppartamentoImg app1Img5 = new AppartamentoImg(app1, "immagini/casa1/bagno.jpg");
        AppartamentoImg app1Img6 = new AppartamentoImg(app1, "immagini/casa1/letto.jpg");

        appartamentoImgService.save(app1Img1);
        appartamentoImgService.save(app1Img2);
        appartamentoImgService.save(app1Img3);
        appartamentoImgService.save(app1Img4);
        appartamentoImgService.save(app1Img5);
        appartamentoImgService.save(app1Img6);

        AppartamentoImg app2Img1 = new AppartamentoImg(app2, "immagini/casa2/esterno.jpg");
        AppartamentoImg app2Img2 = new AppartamentoImg(app2, "immagini/casa2/bagno.jpg");
        AppartamentoImg app2Img3 = new AppartamentoImg(app2, "immagini/casa2/cucina.jpg");
        AppartamentoImg app2Img4 = new AppartamentoImg(app2, "immagini/casa2/cucina2.jpg");
        AppartamentoImg app2Img5 = new AppartamentoImg(app2, "immagini/casa2/letto.jpg");
        AppartamentoImg app2Img6 = new AppartamentoImg(app2, "immagini/casa2/salotto.jpg");

        appartamentoImgService.save(app2Img1);
        appartamentoImgService.save(app2Img2);
        appartamentoImgService.save(app2Img3);
        appartamentoImgService.save(app2Img4);
        appartamentoImgService.save(app2Img5);
        appartamentoImgService.save(app2Img6);

        AppartamentoImg app3Img1 = new AppartamentoImg(app3, "immagini/casa3/esterno.jpg");
        AppartamentoImg app3Img2 = new AppartamentoImg(app3, "immagini/casa3/bagno.jpg");
        AppartamentoImg app3Img3 = new AppartamentoImg(app3, "immagini/casa3/cucina.jpg");
        AppartamentoImg app3Img4 = new AppartamentoImg(app3, "immagini/casa3/cucina2.jpg");
        AppartamentoImg app3Img5 = new AppartamentoImg(app3, "immagini/casa3/letto.jpg");

        appartamentoImgService.save(app3Img1);
        appartamentoImgService.save(app3Img2);
        appartamentoImgService.save(app3Img3);
        appartamentoImgService.save(app3Img4);
        appartamentoImgService.save(app3Img5);

        AppartamentoImg app4Img1 = new AppartamentoImg(app4, "immagini/casa4/esterno.jpg");
        AppartamentoImg app4Img2 = new AppartamentoImg(app4, "immagini/casa4/bagno.jpg");
        AppartamentoImg app4Img3 = new AppartamentoImg(app4, "immagini/casa4/letto.jpg");
        AppartamentoImg app4Img4 = new AppartamentoImg(app4, "immagini/casa4/cucina.jpg");

        appartamentoImgService.save(app4Img1);
        appartamentoImgService.save(app4Img2);
        appartamentoImgService.save(app4Img3);
        appartamentoImgService.save(app4Img4);

        AppartamentoImg app5Img1 = new AppartamentoImg(app5, "immagini/casa5/esterno.jpg");
        AppartamentoImg app5Img2 = new AppartamentoImg(app5, "immagini/casa5/bagno.jpg");
        AppartamentoImg app5Img3 = new AppartamentoImg(app5, "immagini/casa5/cucina.jpg");
        AppartamentoImg app5Img4 = new AppartamentoImg(app5, "immagini/casa5/letto.jpg");
        AppartamentoImg app5Img5 = new AppartamentoImg(app5, "immagini/casa5/salotto.jpg");

        appartamentoImgService.save(app5Img1);
        appartamentoImgService.save(app5Img2);
        appartamentoImgService.save(app5Img3);
        appartamentoImgService.save(app5Img4);
        appartamentoImgService.save(app5Img5);

        AppartamentoImg app6Img1 = new AppartamentoImg(app6, "immagini/casa6/esterno.jpg");
        AppartamentoImg app6Img2 = new AppartamentoImg(app6, "immagini/casa6/bagno.jpg");
        AppartamentoImg app6Img3 = new AppartamentoImg(app6, "immagini/casa6/camera.jpg");
        AppartamentoImg app6Img4 = new AppartamentoImg(app6, "immagini/casa6/cucina.jpg");
        AppartamentoImg app6Img5 = new AppartamentoImg(app6, "immagini/casa6/letto.jpg");
        AppartamentoImg app6Img6 = new AppartamentoImg(app6, "immagini/casa6/salotto.jpg");

        appartamentoImgService.save(app6Img1);
        appartamentoImgService.save(app6Img2);
        appartamentoImgService.save(app6Img3);
        appartamentoImgService.save(app6Img4);
        appartamentoImgService.save(app6Img5);
        appartamentoImgService.save(app6Img6);

        AppartamentoImg app7Img1 = new AppartamentoImg(app7, "immagini/casa7/esterno.jpg");
        AppartamentoImg app7Img2 = new AppartamentoImg(app7, "immagini/casa7/bagno.jpg");
        AppartamentoImg app7Img3 = new AppartamentoImg(app7, "immagini/casa7/salotto.jpg");
        AppartamentoImg app7Img4 = new AppartamentoImg(app7, "immagini/casa7/cucina.jpg");
        AppartamentoImg app7Img5 = new AppartamentoImg(app7, "immagini/casa7/letto.jpg");

        appartamentoImgService.save(app7Img1);
        appartamentoImgService.save(app7Img2);
        appartamentoImgService.save(app7Img3);
        appartamentoImgService.save(app7Img4);
        appartamentoImgService.save(app7Img5);

        AppartamentoImg app8Img1 = new AppartamentoImg(app8, "immagini/casa8/esterno.jpg");
        AppartamentoImg app8Img2 = new AppartamentoImg(app8, "immagini/casa8/bagno.jpg");
        AppartamentoImg app8Img3 = new AppartamentoImg(app8, "immagini/casa8/salotto.jpg");
        AppartamentoImg app8Img4 = new AppartamentoImg(app8, "immagini/casa8/cucina.jpg");
        AppartamentoImg app8Img5 = new AppartamentoImg(app8, "immagini/casa8/letto.jpg");
        AppartamentoImg app8Img6 = new AppartamentoImg(app8, "immagini/casa8/salotto2.jpg");

        appartamentoImgService.save(app8Img1);
        appartamentoImgService.save(app8Img2);
        appartamentoImgService.save(app8Img3);
        appartamentoImgService.save(app8Img4);
        appartamentoImgService.save(app8Img5);
        appartamentoImgService.save(app8Img6);

        AppartamentoImg app9Img1 = new AppartamentoImg(app9, "immagini/casa9/esterno.jpg");
        AppartamentoImg app9Img2 = new AppartamentoImg(app9, "immagini/casa9/bagno.jpg");
        AppartamentoImg app9Img3 = new AppartamentoImg(app9, "immagini/casa9/salotto.jpg");
        AppartamentoImg app9Img4 = new AppartamentoImg(app9, "immagini/casa9/cucina.jpg");
        AppartamentoImg app9Img5 = new AppartamentoImg(app9, "immagini/casa9/letto.jpg");
        AppartamentoImg app9Img6 = new AppartamentoImg(app9, "immagini/casa9/salotto2.jpg");
        AppartamentoImg app9Img7 = new AppartamentoImg(app9, "immagini/casa9/salotto3.jpg");

        appartamentoImgService.save(app9Img1);
        appartamentoImgService.save(app9Img2);
        appartamentoImgService.save(app9Img3);
        appartamentoImgService.save(app9Img4);
        appartamentoImgService.save(app9Img5);
        appartamentoImgService.save(app9Img6);
        appartamentoImgService.save(app9Img7);

        AppartamentoImg app10Img1 = new AppartamentoImg(app10, "immagini/casa10/esterno.jpg");
        AppartamentoImg app10Img2 = new AppartamentoImg(app10, "immagini/casa10/bagno.jpg");
        AppartamentoImg app10Img3 = new AppartamentoImg(app10, "immagini/casa10/salotto.jpg");
        AppartamentoImg app10Img4 = new AppartamentoImg(app10, "immagini/casa10/cucina.jpg");
        AppartamentoImg app10Img5 = new AppartamentoImg(app10, "immagini/casa10/letto.jpg");
        AppartamentoImg app10Img6 = new AppartamentoImg(app10, "immagini/casa10/salotto2.jpg");

        appartamentoImgService.save(app10Img1);
        appartamentoImgService.save(app10Img2);
        appartamentoImgService.save(app10Img3);
        appartamentoImgService.save(app10Img4);
        appartamentoImgService.save(app10Img5);
        appartamentoImgService.save(app10Img6);

        AppartamentoImg app11Img1 = new AppartamentoImg(app11, "immagini/casa11/esterno.jpg");
        AppartamentoImg app11Img2 = new AppartamentoImg(app11, "immagini/casa11/bagno.jpg");
        AppartamentoImg app11Img3 = new AppartamentoImg(app11, "immagini/casa11/salotto.jpg");
        AppartamentoImg app11Img4 = new AppartamentoImg(app11, "immagini/casa11/cucina.jpg");
        AppartamentoImg app11Img5 = new AppartamentoImg(app11, "immagini/casa11/letto.jpg");
        AppartamentoImg app11Img6 = new AppartamentoImg(app11, "immagini/casa11/bagno2.jpg");

        appartamentoImgService.save(app11Img1);
        appartamentoImgService.save(app11Img2);
        appartamentoImgService.save(app11Img3);
        appartamentoImgService.save(app11Img4);
        appartamentoImgService.save(app11Img5);
        appartamentoImgService.save(app11Img6);

        AppartamentoImg app12Img1 = new AppartamentoImg(app12, "immagini/casa12/esterno.jpg");
        AppartamentoImg app12Img2 = new AppartamentoImg(app12, "immagini/casa12/bagno.jpg");
        AppartamentoImg app12Img3 = new AppartamentoImg(app12, "immagini/casa12/salotto.jpg");
        AppartamentoImg app12Img4 = new AppartamentoImg(app12, "immagini/casa12/cucina.jpg");
        AppartamentoImg app12Img5 = new AppartamentoImg(app12, "immagini/casa12/letto.jpg");
        AppartamentoImg app12Img6 = new AppartamentoImg(app12, "immagini/casa12/bagno2.jpg");
        AppartamentoImg app12Img7 = new AppartamentoImg(app12, "immagini/casa12/letto2.jpg");

        appartamentoImgService.save(app12Img1);
        appartamentoImgService.save(app12Img2);
        appartamentoImgService.save(app12Img3);
        appartamentoImgService.save(app12Img4);
        appartamentoImgService.save(app12Img5);
        appartamentoImgService.save(app12Img6);
        appartamentoImgService.save(app12Img7);

        AppartamentoImg app13Img1 = new AppartamentoImg(app13, "immagini/casa13/esterno.jpg");
        AppartamentoImg app13Img2 = new AppartamentoImg(app13, "immagini/casa13/bagno.jpg");
        AppartamentoImg app13Img3 = new AppartamentoImg(app13, "immagini/casa13/salotto.jpg");
        AppartamentoImg app13Img4 = new AppartamentoImg(app13, "immagini/casa13/cucina.jpg");
        AppartamentoImg app13Img5 = new AppartamentoImg(app13, "immagini/casa13/letto.jpg");
        AppartamentoImg app13Img6 = new AppartamentoImg(app13, "immagini/casa13/salotto2.jpg");

        appartamentoImgService.save(app13Img1);
        appartamentoImgService.save(app13Img2);
        appartamentoImgService.save(app13Img3);
        appartamentoImgService.save(app13Img4);
        appartamentoImgService.save(app13Img5);
        appartamentoImgService.save(app13Img6);

        AppartamentoImg app14Img1 = new AppartamentoImg(app14, "immagini/casa14/esterno.jpg");
        AppartamentoImg app14Img2 = new AppartamentoImg(app14, "immagini/casa14/bagno.jpg");
        AppartamentoImg app14Img3 = new AppartamentoImg(app14, "immagini/casa14/salotto.jpg");
        AppartamentoImg app14Img4 = new AppartamentoImg(app14, "immagini/casa14/cucina.jpg");
        AppartamentoImg app14Img5 = new AppartamentoImg(app14, "immagini/casa14/letto.jpg");
        AppartamentoImg app14Img6 = new AppartamentoImg(app14, "immagini/casa14/letto2.jpg");

        appartamentoImgService.save(app14Img1);
        appartamentoImgService.save(app14Img2);
        appartamentoImgService.save(app14Img3);
        appartamentoImgService.save(app14Img4);
        appartamentoImgService.save(app14Img5);
        appartamentoImgService.save(app14Img6);

        AppartamentoImg app15Img1 = new AppartamentoImg(app15, "immagini/casa15/esterno.jpg");
        AppartamentoImg app15Img2 = new AppartamentoImg(app15, "immagini/casa15/bagno.jpg");
        AppartamentoImg app15Img3 = new AppartamentoImg(app15, "immagini/casa15/salotto.jpg");
        AppartamentoImg app15Img4 = new AppartamentoImg(app15, "immagini/casa15/cucina.jpg");
        AppartamentoImg app15Img5 = new AppartamentoImg(app15, "immagini/casa15/letto.jpg");

        appartamentoImgService.save(app15Img1);
        appartamentoImgService.save(app15Img2);
        appartamentoImgService.save(app15Img3);
        appartamentoImgService.save(app15Img4);
        appartamentoImgService.save(app15Img5);

        AppartamentoImg app16Img1 = new AppartamentoImg(app16, "immagini/casa16/esterno.jpg");
        AppartamentoImg app16Img2 = new AppartamentoImg(app16, "immagini/casa16/bagno.jpg");
        AppartamentoImg app16Img3 = new AppartamentoImg(app16, "immagini/casa16/salotto.jpg");
        AppartamentoImg app16Img4 = new AppartamentoImg(app16, "immagini/casa16/cucina.jpg");
        AppartamentoImg app16Img5 = new AppartamentoImg(app16, "immagini/casa16/letto.jpg");
        AppartamentoImg app16Img6 = new AppartamentoImg(app16, "immagini/casa16/salotto2.jpg");

        appartamentoImgService.save(app16Img1);
        appartamentoImgService.save(app16Img2);
        appartamentoImgService.save(app16Img3);
        appartamentoImgService.save(app16Img4);
        appartamentoImgService.save(app16Img5);
        appartamentoImgService.save(app16Img6);

        AppartamentoImg app17Img1 = new AppartamentoImg(app17, "immagini/casa17/esterno.jpg");
        AppartamentoImg app17Img2 = new AppartamentoImg(app17, "immagini/casa17/bagno.jpg");
        AppartamentoImg app17Img3 = new AppartamentoImg(app17, "immagini/casa17/salotto.jpg");
        AppartamentoImg app17Img4 = new AppartamentoImg(app17, "immagini/casa17/cucina.jpg");
        AppartamentoImg app17Img5 = new AppartamentoImg(app17, "immagini/casa17/letto.jpg");

        appartamentoImgService.save(app17Img1);
        appartamentoImgService.save(app17Img2);
        appartamentoImgService.save(app17Img3);
        appartamentoImgService.save(app17Img4);
        appartamentoImgService.save(app17Img5);

        AppartamentoImg app18Img1 = new AppartamentoImg(app18, "immagini/casa18/esterno.jpg");
        AppartamentoImg app18Img2 = new AppartamentoImg(app18, "immagini/casa18/bagno.jpg");
        AppartamentoImg app18Img3 = new AppartamentoImg(app18, "immagini/casa18/cucina2.jpg");
        AppartamentoImg app18Img4 = new AppartamentoImg(app18, "immagini/casa18/cucina.jpg");
        AppartamentoImg app18Img5 = new AppartamentoImg(app18, "immagini/casa18/letto.jpg");

        appartamentoImgService.save(app18Img1);
        appartamentoImgService.save(app18Img2);
        appartamentoImgService.save(app18Img3);
        appartamentoImgService.save(app18Img4);
        appartamentoImgService.save(app18Img5);

        AppartamentoImg app19Img1 = new AppartamentoImg(app19, "immagini/casa19/esterno.jpg");
        AppartamentoImg app19Img2 = new AppartamentoImg(app19, "immagini/casa19/bagno.jpg");
        AppartamentoImg app19Img3 = new AppartamentoImg(app19, "immagini/casa19/cucina2.jpg");
        AppartamentoImg app19Img4 = new AppartamentoImg(app19, "immagini/casa19/cucina.jpg");
        AppartamentoImg app19Img5 = new AppartamentoImg(app19, "immagini/casa19/letto.jpg");

        appartamentoImgService.save(app19Img1);
        appartamentoImgService.save(app19Img2);
        appartamentoImgService.save(app19Img3);
        appartamentoImgService.save(app19Img4);
        appartamentoImgService.save(app19Img5);

        AppartamentoImg app20Img1 = new AppartamentoImg(app20, "immagini/casa20/esterno.jpg");
        AppartamentoImg app20Img2 = new AppartamentoImg(app20, "immagini/casa20/bagno.jpg");
        AppartamentoImg app20Img3 = new AppartamentoImg(app20, "immagini/casa20/letto.jpg");
        AppartamentoImg app20Img4 = new AppartamentoImg(app20, "immagini/casa20/cucina.jpg");

        appartamentoImgService.save(app20Img1);
        appartamentoImgService.save(app20Img2);
        appartamentoImgService.save(app20Img3);
        appartamentoImgService.save(app20Img4);

        AppartamentoImg app21Img1 = new AppartamentoImg(app21, "immagini/casa21/esterno.jpg");
        AppartamentoImg app21Img2 = new AppartamentoImg(app21, "immagini/casa21/bagno.jpg");
        AppartamentoImg app21Img3 = new AppartamentoImg(app21, "immagini/casa21/letto.jpg");
        AppartamentoImg app21Img4 = new AppartamentoImg(app21, "immagini/casa21/cucina.jpg");
        AppartamentoImg app21Img5 = new AppartamentoImg(app21, "immagini/casa21/salotto.jpg");

        appartamentoImgService.save(app21Img1);
        appartamentoImgService.save(app21Img2);
        appartamentoImgService.save(app21Img3);
        appartamentoImgService.save(app21Img4);
        appartamentoImgService.save(app21Img5);

        AppartamentoImg app22Img1 = new AppartamentoImg(app22, "immagini/casa22/esterno.jpg");
        AppartamentoImg app22Img2 = new AppartamentoImg(app22, "immagini/casa22/bagno.jpg");
        AppartamentoImg app22Img3 = new AppartamentoImg(app22, "immagini/casa22/letto.jpg");
        AppartamentoImg app22Img4 = new AppartamentoImg(app22, "immagini/casa22/cucina.jpg");
        AppartamentoImg app22Img5 = new AppartamentoImg(app22, "immagini/casa22/salotto.jpg");
        AppartamentoImg app22Img6 = new AppartamentoImg(app22, "immagini/casa22/salotto2.jpg");
        AppartamentoImg app22Img7 = new AppartamentoImg(app22, "immagini/casa22/letto2.jpg");

        appartamentoImgService.save(app22Img1);
        appartamentoImgService.save(app22Img2);
        appartamentoImgService.save(app22Img3);
        appartamentoImgService.save(app22Img4);
        appartamentoImgService.save(app22Img5);
        appartamentoImgService.save(app22Img6);
        appartamentoImgService.save(app22Img7);

        AppartamentoImg app23Img1 = new AppartamentoImg(app23, "immagini/casa23/esterno.jpg");
        AppartamentoImg app23Img2 = new AppartamentoImg(app23, "immagini/casa23/bagno.jpg");
        AppartamentoImg app23Img3 = new AppartamentoImg(app23, "immagini/casa23/letto.jpg");
        AppartamentoImg app23Img4 = new AppartamentoImg(app23, "immagini/casa23/cucina.jpg");
        AppartamentoImg app23Img5 = new AppartamentoImg(app23, "immagini/casa23/salotto.jpg");
        AppartamentoImg app23Img6 = new AppartamentoImg(app23, "immagini/casa23/salotto2.jpg");
        AppartamentoImg app23Img7 = new AppartamentoImg(app23, "immagini/casa23/salotto3.jpg");

        appartamentoImgService.save(app23Img1);
        appartamentoImgService.save(app23Img2);
        appartamentoImgService.save(app23Img3);
        appartamentoImgService.save(app23Img4);
        appartamentoImgService.save(app23Img5);
        appartamentoImgService.save(app23Img6);
        appartamentoImgService.save(app23Img7);

        AppartamentoImg app24Img1 = new AppartamentoImg(app24, "immagini/casa24/esterno.jpg");
        AppartamentoImg app24Img2 = new AppartamentoImg(app24, "immagini/casa24/bagno.jpg");
        AppartamentoImg app24Img3 = new AppartamentoImg(app24, "immagini/casa24/letto.jpg");

        appartamentoImgService.save(app24Img1);
        appartamentoImgService.save(app24Img2);
        appartamentoImgService.save(app24Img3);

        AppartamentoImg app25Img1 = new AppartamentoImg(app25, "immagini/casa25/esterno.jpg");
        AppartamentoImg app25Img2 = new AppartamentoImg(app25, "immagini/casa25/bagno.jpg");
        AppartamentoImg app25Img3 = new AppartamentoImg(app25, "immagini/casa25/letto.jpg");

        appartamentoImgService.save(app25Img1);
        appartamentoImgService.save(app25Img2);
        appartamentoImgService.save(app25Img3);

        AppartamentoImg app26Img1 = new AppartamentoImg(app26, "immagini/casa26/esterno.jpg");
        AppartamentoImg app26Img2 = new AppartamentoImg(app26, "immagini/casa26/bagno.jpg");
        AppartamentoImg app26Img3 = new AppartamentoImg(app26, "immagini/casa26/letto.jpg");

        appartamentoImgService.save(app26Img1);
        appartamentoImgService.save(app26Img2);
        appartamentoImgService.save(app26Img3);

        System.out.println("sono arrivato qui!");
    }
}
