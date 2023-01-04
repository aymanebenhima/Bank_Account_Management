package ws;

import classes.Operation;
import classes.Operations;
import classes.Releve;
import jakarta.jws.WebMethod;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "Releve")
public class ReleveService {

      @WebMethod(operationName = "consulterReleve")
      @WebResult(name = "Releve")
    public Releve consulterReleve()  {

        Operations ops=new Operations(new Date(),new Date());
        ops.getOperation().add(new Operation("CREDIT",new Date(),9000,"Vers Espece"));
        ops.getOperation().add(new Operation("DEBIT", new Date(),3400,"Cheque Guichet"));
        ops.getOperation().add(new Operation("DEBIT",new Date(),120,"Prelevement Assurance"));
        ops.getOperation().add(new Operation("CREDIT",new Date(),70000,"Virement"));
        return new Releve("0101010101",15000,new Date(),ops );

    }
}
