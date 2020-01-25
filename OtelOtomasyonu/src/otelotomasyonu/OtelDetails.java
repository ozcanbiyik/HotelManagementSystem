/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otelotomasyonu;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author ozcan
 */
@Entity
@Table(name = "otel_details", catalog = "otelm", schema = "")
@NamedQueries({
    @NamedQuery(name = "OtelDetails.findAll", query = "SELECT o FROM OtelDetails o")
    , @NamedQuery(name = "OtelDetails.findById", query = "SELECT o FROM OtelDetails o WHERE o.id = :id")
    , @NamedQuery(name = "OtelDetails.findByOtelName", query = "SELECT o FROM OtelDetails o WHERE o.otelName = :otelName")
    , @NamedQuery(name = "OtelDetails.findByOtelMevki", query = "SELECT o FROM OtelDetails o WHERE o.otelMevki = :otelMevki")
    , @NamedQuery(name = "OtelDetails.findByOtelStar", query = "SELECT o FROM OtelDetails o WHERE o.otelStar = :otelStar")
    , @NamedQuery(name = "OtelDetails.findByOtelPrice", query = "SELECT o FROM OtelDetails o WHERE o.otelPrice = :otelPrice")})
public class OtelDetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "otel_name")
    private String otelName;
    @Basic(optional = false)
    @Column(name = "otel_mevki")
    private String otelMevki;
    @Basic(optional = false)
    @Column(name = "otel_star")
    private String otelStar;
    @Basic(optional = false)
    @Column(name = "otel_price")
    private String otelPrice;

    public OtelDetails() {
    }

    public OtelDetails(Integer id) {
        this.id = id;
    }

    public OtelDetails(Integer id, String otelName, String otelMevki, String otelStar, String otelPrice) {
        this.id = id;
        this.otelName = otelName;
        this.otelMevki = otelMevki;
        this.otelStar = otelStar;
        this.otelPrice = otelPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getOtelName() {
        return otelName;
    }

    public void setOtelName(String otelName) {
        String oldOtelName = this.otelName;
        this.otelName = otelName;
        changeSupport.firePropertyChange("otelName", oldOtelName, otelName);
    }

    public String getOtelMevki() {
        return otelMevki;
    }

    public void setOtelMevki(String otelMevki) {
        String oldOtelMevki = this.otelMevki;
        this.otelMevki = otelMevki;
        changeSupport.firePropertyChange("otelMevki", oldOtelMevki, otelMevki);
    }

    public String getOtelStar() {
        return otelStar;
    }

    public void setOtelStar(String otelStar) {
        String oldOtelStar = this.otelStar;
        this.otelStar = otelStar;
        changeSupport.firePropertyChange("otelStar", oldOtelStar, otelStar);
    }

    public String getOtelPrice() {
        return otelPrice;
    }

    public void setOtelPrice(String otelPrice) {
        String oldOtelPrice = this.otelPrice;
        this.otelPrice = otelPrice;
        changeSupport.firePropertyChange("otelPrice", oldOtelPrice, otelPrice);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OtelDetails)) {
            return false;
        }
        OtelDetails other = (OtelDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "otelotomasyonu.OtelDetails[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
