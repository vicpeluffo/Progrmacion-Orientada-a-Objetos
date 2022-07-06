package Hamburgueseria;

public class Acompaniamiento implements Comprable {

    private String tipo;
    private Double precio;
    private String tamanio;

    public Acompaniamiento(String tipo, Double precio, String tamanio) {
        this.tipo = tipo;
        this.precio = precio;
        this.tamanio = tamanio;
    }

    @Override
    public Double getPrecio() {
        return this.precio;
    }
}
