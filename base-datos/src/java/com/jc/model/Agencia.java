package com.jc.model;
/**
 * @author Edgar
 */
public class Agencia {
    private int id_agencia;
    private String nombre_agencia;
    private String direccion_agencia;

    public Agencia(int id_agencia, String nombre_agencia, String direccion_agencia) {
        this.id_agencia = id_agencia;
        this.nombre_agencia = nombre_agencia;
        this.direccion_agencia = direccion_agencia;
    }

    public int getId_agencia() {
        return id_agencia;
    }

    public void setId_agencia(int id_agencia) {
        this.id_agencia = id_agencia;
    }

    public String getNombre_agencia() {
        return nombre_agencia;
    }

    public void setNombre_agencia(String nombre_agencia) {
        this.nombre_agencia = nombre_agencia;
    }

    public String getDireccion_agencia() {
        return direccion_agencia;
    }

    public void setDireccion_agencia(String direccion_agencia) {
        this.direccion_agencia = direccion_agencia;
    }
    
    
}
