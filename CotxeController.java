package gallardo.erick.dam.mp06.uf01.p03.serialitzacio.xml.controllers;

import gallardo.erick.dam.mp06.uf01.p03.serialitzacio.xml.model.domain.Cotxe;
import gallardo.erick.dam.mp06.uf01.p03.serialitzacio.xml.model.service.CotxeSerialitzacioXmlService;

public class CotxeController {

    private final CotxeSerialitzacioXmlService cotxeService;

    public CotxeController() {
        this.cotxeService = new CotxeSerialitzacioXmlService();
    }

    public void guardarCotxe(Cotxe cotxe) {
        cotxeService.serialitzaCotxe(cotxe);
        System.out.println("Cotxe guardat correctament.");
    }

    public Cotxe carregarCotxe() {
        return cotxeService.deserialitzaCotxe();
    }
}