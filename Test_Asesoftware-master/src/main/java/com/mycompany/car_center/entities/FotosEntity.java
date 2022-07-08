package com.mycompany.car_center.entities;

import javax.persistence.*;

@Entity
@Table(name = "fotos", schema = "carcenter", catalog = "")
public class FotosEntity {
    private int codigo;
    private String ruta;

    @Id
    @Column(name = "CODIGO")
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "RUTA")
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FotosEntity that = (FotosEntity) o;

        if (codigo != that.codigo) return false;
        if (ruta != null ? !ruta.equals(that.ruta) : that.ruta != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codigo;
        result = 31 * result + (ruta != null ? ruta.hashCode() : 0);
        return result;
    }
}
