//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.02.23 a las 12:28:53 PM COT 
//


package com.bmatic.schemas.citas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Citas" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "citas"
})
@XmlRootElement(name = "CitaDetailsResponse")
public class CitaDetailsResponse {

    @XmlElement(name = "Citas", required = true)
    protected String citas;

    /**
     * Obtiene el valor de la propiedad citas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitas() {
        return citas;
    }

    /**
     * Define el valor de la propiedad citas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitas(String value) {
        this.citas = value;
    }

}
