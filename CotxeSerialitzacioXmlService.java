package gallardo.erick.dam.mp06.uf01.p03.serialitzacio.xml.model.service;

import cognom1gallardo.erick.dam.mp06.uf01.p03.serialitzacio.xml.model.repository.CotxeSerialitzacioXmlRepository;
import gallardo.erick.dam.mp06.uf01.p03.serialitzacio.xml.model.configuration.Settings;
import gallardo.erick.dam.mp06.uf01.p03.serialitzacio.xml.model.domain.Cotxe;

public class CotxeSerialitzacioXmlService {

    private final CotxeSerialitzacioXmlRepository repository;

    public CotxeSerialitzacioXmlService() {
        this.repository = new CotxeSerialitzacioXmlRepository();
    }

    public void serialitzaCotxe(Cotxe cotxe) {
        repository.serialitzaCotxe(cotxe, Settings.FITXER_COTXE);
    }

    public Cotxe deserialitzaCotxe() {
        return repository.deserialitzaCotxe(Settings.FITXER_COTXE);
    }
}
