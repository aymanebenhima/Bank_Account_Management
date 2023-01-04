package classes;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@XmlAccessorType(XmlAccessType.FIELD)
public class Operations {
    @XmlAttribute
    private  Date dateDebut;
    @XmlAttribute
    private Date dateFin;
    private List<Operation> operation=new ArrayList<>();

    public List<Operation> getOperation() {
        return operation;
    }

    public Operations() {
    }

    public Operations(Date dateDebut, Date dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;

    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setOperation(List<Operation> operation) {
        this.operation = operation;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    @Override
    public String toString() {
        return "classes.Operations{" +
                "dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", operation=" + operation + "\n"+
                '}';
    }

}
