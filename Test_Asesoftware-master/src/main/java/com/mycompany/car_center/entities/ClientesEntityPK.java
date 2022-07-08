package com.mycompany.car_center.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ClientesEntityPK implements Serializable {
    private String tipoDocumento;
    private int documento;

    @Column(name = "TIPO_DOCUMENTO")
    @Id
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Column(name = "DOCUMENTO")
    @Id
    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientesEntityPK that = (ClientesEntityPK) o;

        if (documento != that.documento) return false;
        if (tipoDocumento != null ? !tipoDocumento.equals(that.tipoDocumento) : that.tipoDocumento != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tipoDocumento != null ? tipoDocumento.hashCode() : 0;
        result = 31 * result + documento;
        return result;
    }
}
