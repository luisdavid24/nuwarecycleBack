package nuwarecycleBack.src.main.java.com.nuwarecycle.nuwarecycle.models;

public class Donacion {

    private int id_don;

    private String tipo_don;

    private float cantidad;

    public int getId_don() {
        return id_don;
    }

    public void setId_don(int id_don) {
        this.id_don = id_don;
    }

    public String getTipo_don() {
        return tipo_don;
    }

    public void setTipo_don(String tipo_don) {
        this.tipo_don = tipo_don;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
}
