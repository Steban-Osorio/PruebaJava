package com.mycompany.car_center.entities;

import javax.persistence.*;

@Entity
@Table(name = "vehiculos", schema = "carcenter", catalog = "")
public class VehiculosEntity {
    private String placa;
    private String color;
    private MarcasEntity marcasByCodMarca;
    private ClientesEntity clientes;

    @Id
    @Column(name = "PLACA")
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Basic
    @Column(name = "COLOR")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehiculosEntity that = (VehiculosEntity) o;

        if (placa != null ? !placa.equals(that.placa) : that.placa != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = placa != null ? placa.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "COD_MARCA", referencedColumnName = "codigo", nullable = false)
    public MarcasEntity getMarcasByCodMarca() {
        return marcasByCodMarca;
    }

    public void setMarcasByCodMarca(MarcasEntity marcasByCodMarca) {
        this.marcasByCodMarca = marcasByCodMarca;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "CLI_TIPO_DOCUMENTO", referencedColumnName = "TIPO_DOCUMENTO", nullable = false), @JoinColumn(name = "CLI_DOCUMENTO", referencedColumnName = "DOCUMENTO", nullable = false)})
    public ClientesEntity getClientes() {
        return clientes;
    }

    public void setClientes(ClientesEntity clientes) {
        this.clientes = clientes;
    }
}
