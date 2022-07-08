package com.mycompany.car_center.entities;

import javax.persistence.*;

@Entity
@Table(name = "marcas", schema = "carcenter", catalog = "")
public class MarcasEntity {
    private int codigo;
    private String nombreMarca;

    @Id
    @Column(name = "codigo")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "NOMBRE_MARCA")
    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarcasEntity that = (MarcasEntity) o;

        if (codigo != that.codigo) return false;
        if (nombreMarca != null ? !nombreMarca.equals(that.nombreMarca) : that.nombreMarca != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codigo;
        result = 31 * result + (nombreMarca != null ? nombreMarca.hashCode() : 0);
        return result;
    }
}
