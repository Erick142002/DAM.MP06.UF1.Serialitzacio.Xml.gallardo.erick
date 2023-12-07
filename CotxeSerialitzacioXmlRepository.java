package cognom1gallardo.erick.dam.mp06.uf01.p03.serialitzacio.xml.model.repository;

import javax.xml.bind.*;

import gallardo.erick.dam.mp06.uf01.p03.serialitzacio.xml.model.domain.Cotxe;

import java.io.File;

public class CotxeSerialitzacioXmlRepository {

    public void serialitzaCotxe(Cotxe cotxe, String fitxer) {
        try {
            JAXBContext context = JAXBContext.newInstance(Cotxe.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(cotxe, new File(fitxer));
        } catch (JAXBException e) {
            e.printStackTrace();
           
        }
    }

    public Cotxe deserialitzaCotxe(String fitxer) {
        try {
            JAXBContext context = JAXBContext.newInstance(Cotxe.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            return (Cotxe) unmarshaller.unmarshal(new File(fitxer));
        } catch (JAXBException e) {
            e.printStackTrace();
            // Manejar la excepción según tu lógica de manejo de errores
            return null;
        }
    }
}