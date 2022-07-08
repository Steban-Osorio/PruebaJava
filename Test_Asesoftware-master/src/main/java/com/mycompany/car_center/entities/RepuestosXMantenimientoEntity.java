package com.mycompany.car_center.entities;

import javax.persistence.*;

@Entity
@Table(name = "repuestos_x_mantenimiento", schema = "carcenter", catalog = "")
public class RepuestosXMantenimientoEntity {
    private int codigo;
    private int unidades;
    private int tiempoEstimado;
    private MantenimientosEntity mantenimientosByCodMantenimiento;
    private RepuestosEntity repuestosByCodRepuesto;

    @Id
    @Column(name = "CODIGO")
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "UNIDADES")
    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Basic
    @Column(name = "TIEMPO_ESTIMADO")
    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RepuestosXMantenimientoEntity that = (RepuestosXMantenimientoEntity) o;

        if (codigo != that.codigo) return false;
        if (unidades != that.unidades) return false;
        if (tiempoEstimado != that.tiempoEstimado) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codigo;
        result = 31 * result + unidades;
        result = 31 * result + tiempoEstimado;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "COD_MANTENIMIENTO", referencedColumnName = "CODIGO", nullable = false)
    public MantenimientosEntity getMantenimientosByCodMantenimiento() {
        return mantenimientosByCodMantenimiento;
    }

    public void setMantenimientosByCodMantenimiento(MantenimientosEntity mantenimientosByCodMantenimiento) {
        this.mantenimientosByCodMantenimiento = mantenimientosByCodMantenimiento;
    }

    @ManyToOne
    @JoinColumn(name = "COD_REPUESTO", referencedColumnName = "CODIGO", nullable = false)
    public RepuestosEntity getRepuestosByCodRepuesto() {
        return repuestosByCodRepuesto;
    }

    public void setRepuestosByCodRepuesto(RepuestosEntity repuestosByCodRepuesto) {
        this.repuestosByCodRepuesto = repuestosByCodRepuesto;
    }
}
