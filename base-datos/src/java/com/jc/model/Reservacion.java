package com.jc.model;
/**
 * @author Edgar
 */
public class Reservacion {
    private int id_reservacion;
    private long fecha_inicio;
    private long fecha_fin;

    public Reservacion(int id_reservacion, long fecha_inicio, long fecha_fin) {
        this.id_reservacion = id_reservacion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public int getId_reservacion() {
        return id_reservacion;
    }

    public void setId_reservacion(int id_reservacion) {
        this.id_reservacion = id_reservacion;
    }

    public long getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(long fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public long getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(long fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    
    
    
}
