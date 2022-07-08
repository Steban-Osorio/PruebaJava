package com.mycompany.car_center.entities;

import javax.persistence.*;

@Entity
@Table(name = "servicios", schema = "carcenter", catalog = "")
public class ServiciosEntity {
    private int codigo;
    private String nombreServicio;
    private int precio;

    @Id
    @Column(name = "CODIGO")
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "NOMBRE_SERVICIO")
    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    @Basic
    @Column(name = "PRECIO")
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiciosEntity that = (ServiciosEntity) o;

        if (codigo != that.codigo) return false;
        if (precio != that.precio) return false;
        if (nombreServicio != null ? !nombreServicio.equals(that.nombreServicio) : that.nombreServicio != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codigo;
        result = 31 * result + (nombreServicio != null ? nombreServicio.hashCode() : 0);
        result = 31 * result + precio;
        return result;
    }
}
