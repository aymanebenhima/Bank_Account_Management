import classes.Releve;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.SchemaOutputResolver;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class AppSchemaXML {

    public static void main(String[] args) throws Exception {

        JAXBContext jaxbContext=JAXBContext.newInstance(Releve.class);
        jaxbContext.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String s, String s1)  {
                File f=new File("releve.xsd");
                StreamResult result=new StreamResult(f);
                result.setSystemId(f.getName());
                return result;
            }
        });
    }
}
