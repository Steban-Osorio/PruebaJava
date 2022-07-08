package com.mycompany.car_center.entities;

import javax.persistence.*;

@Entity
@Table(name = "repuestos", schema = "carcenter", catalog = "")
public class RepuestosEntity {
    private int codigo;
    private String nombreRepuesto;
    private int precioUnitario;
    private int unidadesInventario;
    private String proveedor;

    @Id
    @Column(name = "CODIGO")
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "NOMBRE_REPUESTO")
    public String getNombreRepuesto() {
        return nombreRepuesto;
    }

    public void setNombreRepuesto(String nombreRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
    }

    @Basic
    @Column(name = "PRECIO_UNITARIO")
    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Basic
    @Column(name = "UNIDADES_INVENTARIO")
    public int getUnidadesInventario() {
        return unidadesInventario;
    }

    public void setUnidadesInventario(int unidadesInventario) {
        this.unidadesInventario = unidadesInventario;
    }

    @Basic
    @Column(name = "PROVEEDOR")
    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RepuestosEntity that = (RepuestosEntity) o;

        if (codigo != that.codigo) return false;
        if (precioUnitario != that.precioUnitario) return false;
        if (unidadesInventario != that.unidadesInventario) return false;
        if (nombreRepuesto != null ? !nombreRepuesto.equals(that.nombreRepuesto) : that.nombreRepuesto != null)
            return false;
        if (proveedor != null ? !proveedor.equals(that.proveedor) : that.proveedor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codigo;
        result = 31 * result + (nombreRepuesto != null ? nombreRepuesto.hashCode() : 0);
        result = 31 * result + precioUnitario;
        result = 31 * result + unidadesInventario;
        result = 31 * result + (proveedor != null ? proveedor.hashCode() : 0);
        return result;
    }
}
