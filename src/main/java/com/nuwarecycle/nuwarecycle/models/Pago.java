package com.nuwarecycle.nuwarecycle.models;

public class Pago {

    private int id_pago;

    private String metodo_pago;

    private int detalles_id;

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public int getDetalles_id() {
        return detalles_id;
    }

    public void setDetalles_id(int detalles_id) {
        this.detalles_id = detalles_id;
    }
}
