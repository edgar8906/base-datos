package com.jc.model;
/**
 * @author Edgar
 */
public class Cliente {
    private int id_reservacion;
    private int id_cliente;
    private String nombre_cliente;
    private String apellidos_cliente;
    private String telefono_cliente;
    private String direccion_cliente;

    public Cliente(int id_reservacion, int id_cliente, String nombre_cliente, String apellidos_cliente, String telefono_cliente, String direccion_cliente) {
        this.id_reservacion = id_reservacion;
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellidos_cliente = apellidos_cliente;
        this.telefono_cliente = telefono_cliente;
        this.direccion_cliente = direccion_cliente;
    }

    public int getId_reservacion() {
        return id_reservacion;
    }

    public void setId_reservacion(int id_reservacion) {
        this.id_reservacion = id_reservacion;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellidos_cliente() {
        return apellidos_cliente;
    }

    public void setApellidos_cliente(String apellidos_cliente) {
        this.apellidos_cliente = apellidos_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }
    
    
    
}
