
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour consulterReleveResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="consulterReleveResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Releve" type="{http://ws/}releve" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consulterReleveResponse", propOrder = {
    "releve"
})
public class ConsulterReleveResponse {

    @XmlElement(name = "Releve")
    protected Releve releve;

    /**
     * Obtient la valeur de la propriété releve.
     * 
     * @return
     *     possible object is
     *     {@link Releve }
     *     
     */
    public Releve getReleve() {
        return releve;
    }

    /**
     * Définit la valeur de la propriété releve.
     * 
     * @param value
     *     allowed object is
     *     {@link Releve }
     *     
     */
    public void setReleve(Releve value) {
        this.releve = value;
    }

}
