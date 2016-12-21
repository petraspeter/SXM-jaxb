import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBUCIRoad {
    
    public static void main(String[] args) {
        
        try {
            
            File file = new File("uciRoad.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(UCIRoad.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            UCIRoad uciRoad = (UCIRoad) jaxbUnmarshaller.unmarshal(file);
            uciRoad.writeUCIRoad();
            
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        
    }
}
