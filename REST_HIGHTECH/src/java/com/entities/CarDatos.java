/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juan Camilo
 */
@Entity
@Table(name = "CAR_DATOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CarDatos.findAll", query = "SELECT c FROM CarDatos c"),
    @NamedQuery(name = "CarDatos.findByKPersona", query = "SELECT c FROM CarDatos c WHERE c.kPersona = :kPersona"),
    @NamedQuery(name = "CarDatos.findByNNombre", query = "SELECT c FROM CarDatos c WHERE c.nNombre = :nNombre"),
    @NamedQuery(name = "CarDatos.findByNApellido", query = "SELECT c FROM CarDatos c WHERE c.nApellido = :nApellido"),
    @NamedQuery(name = "CarDatos.findByOCorreo", query = "SELECT c FROM CarDatos c WHERE c.oCorreo = :oCorreo"),
    @NamedQuery(name = "CarDatos.findByKCodtarjeta", query = "SELECT c FROM CarDatos c WHERE c.kCodtarjeta = :kCodtarjeta"),
    @NamedQuery(name = "CarDatos.findByNNombreTarjeta", query = "SELECT c FROM CarDatos c WHERE c.nNombreTarjeta = :nNombreTarjeta")})
public class CarDatos implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Basic(optional = false)
    @NotNull
    @Column(name = "K_PERSONA")
    private BigDecimal kPersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "N_NOMBRE")
    private String nNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "N_APELLIDO")
    private String nApellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "O_CORREO")
    private String oCorreo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "K_CODTARJETA")
    private BigInteger kCodtarjeta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "N_NOMBRE_TARJETA")
    private String nNombreTarjeta;

    public CarDatos() {
    }

    public CarDatos(BigDecimal kPersona) {
        this.kPersona = kPersona;
    }

    public CarDatos(BigDecimal kPersona, String nNombre, String nApellido, String oCorreo, BigInteger kCodtarjeta, String nNombreTarjeta) {
        this.kPersona = kPersona;
        this.nNombre = nNombre;
        this.nApellido = nApellido;
        this.oCorreo = oCorreo;
        this.kCodtarjeta = kCodtarjeta;
        this.nNombreTarjeta = nNombreTarjeta;
    }

    public BigDecimal getKPersona() {
        return kPersona;
    }

    public void setKPersona(BigDecimal kPersona) {
        this.kPersona = kPersona;
    }

    public String getNNombre() {
        return nNombre;
    }

    public void setNNombre(String nNombre) {
        this.nNombre = nNombre;
    }

    public String getNApellido() {
        return nApellido;
    }

    public void setNApellido(String nApellido) {
        this.nApellido = nApellido;
    }

    public String getOCorreo() {
        return oCorreo;
    }

    public void setOCorreo(String oCorreo) {
        this.oCorreo = oCorreo;
    }

    public BigInteger getKCodtarjeta() {
        return kCodtarjeta;
    }

    public void setKCodtarjeta(BigInteger kCodtarjeta) {
        this.kCodtarjeta = kCodtarjeta;
    }

    public String getNNombreTarjeta() {
        return nNombreTarjeta;
    }

    public void setNNombreTarjeta(String nNombreTarjeta) {
        this.nNombreTarjeta = nNombreTarjeta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kPersona != null ? kPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarDatos)) {
            return false;
        }
        CarDatos other = (CarDatos) object;
        if ((this.kPersona == null && other.kPersona != null) || (this.kPersona != null && !this.kPersona.equals(other.kPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.CarDatos[ kPersona=" + kPersona + " ]";
    }
    
}
