package com.jc.model;
/**
 * @author Edgar
 */
public class Auto {
    private int id_auto;
    private int id_cliente;
    private String placas;
    private String tipo_auto;

    public Auto(int id_auto, int id_cliente, String placas, String tipo_auto) {
        this.id_auto = id_auto;
        this.id_cliente = id_cliente;
        this.placas = placas;
        this.tipo_auto = tipo_auto;
    }

    public int getId_auto() {
        return id_auto;
    }

    public void setId_auto(int id_auto) {
        this.id_auto = id_auto;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getTipo_auto() {
        return tipo_auto;
    }

    public void setTipo_auto(String tipo_auto) {
        this.tipo_auto = tipo_auto;
    }
    
    
    
}
