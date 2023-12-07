package gallardo.erick.dam.mp06.uf01.p03.serialitzacio.xml.app;

import gallardo.erick.dam.mp06.uf01.p03.serialitzacio.xml.controllers.CotxeController;
import gallardo.erick.dam.mp06.uf01.p03.serialitzacio.xml.model.domain.Cotxe;

public class Main {

    public static void main(String[] args) {
        CotxeController cotxeController = new CotxeController();

        
        Cotxe cotxe = new Cotxe("1234ABC", "Marca", "Model", "0000000000");

        
        cotxeController.guardarCotxe(cotxe);

       
        Cotxe cotxeCargat = cotxeController.carregarCotxe();
        System.out.println("Cotxe carregat: " + cotxeCargat);
    }
}