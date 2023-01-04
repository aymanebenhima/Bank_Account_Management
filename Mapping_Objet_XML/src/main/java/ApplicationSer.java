import classes.Operation;
import classes.Operations;
import classes.Releve;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.Date;

public class ApplicationSer {


    public static void main(String[] args) throws JAXBException {
        Operations ops=new Operations(new Date(2022,11,01),new Date(2022,11,30));
        ops.getOperation().add(new Operation("CREDIT",new Date(2022,11,01),9000,"Vers Espece"));
        ops.getOperation().add(new Operation("DEBIT", new Date(),3400,"Cheque Guichet"));
        ops.getOperation().add(new Operation("DEBIT",new Date(),120,"Prelevement Assurance"));
        ops.getOperation().add(new Operation("CREDIT",new Date(),70000,"Virement"));
        Releve releve= new Releve("01010101011010",7500,new Date() ,ops);
        JAXBContext jaxbContext=JAXBContext.newInstance(Releve.class);
        Marshaller marshaller=jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(releve,new File("releve.xml"));
    }


}
