package classes;

import jakarta.xml.bind.annotation.*;

import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Releve {

    @XmlAttribute
    private String RIB;
    @XmlAttribute
    private double solde;
    @XmlAttribute
    private Date dateReleve;
    @XmlElement(name = "operations")
    private Operations op;

    public Releve() {
    }

    public Releve(String RIB, double solde, Date dateReleve, Operations op) {
        this.RIB = RIB;
        this.solde = solde;
        this.dateReleve = dateReleve;
        this.op = op;
    }

    public String getRIB() {
        return RIB;
    }

    public void setRIB(String RIB) {
        this.RIB = RIB;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    public Operations getOp() {
        return op;
    }

    public void setOp(Operations op) {
        this.op = op;
    }
    @Override
    public String toString() {
        return "classes.Releve{" +
                "RIB='" + RIB + '\'' +
                ", solde=" + solde +
                ", dateReleve=" + dateReleve +
                ", \n op=" + op + "\n"+
                '}';
    }
}

