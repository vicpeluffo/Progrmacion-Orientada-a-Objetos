package Logistica;

import java.util.ArrayList;

public class Contenedor implements Calculable{

    private String nombre;
    private String descripcion;
    private Double pesoContenedor;

    private ArrayList<Calculable> contenedor = new ArrayList<>();

    public Contenedor(String nombre, String descripcion, Double pesoContenedor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pesoContenedor = pesoContenedor;
    }

    public void addCarga(Calculable c){
        this.contenedor.add(c);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPesoContenedor() {
        return pesoContenedor;
    }

    public void setPesoContenedor(Double pesoContenedor) {
        this.pesoContenedor = pesoContenedor;
    }

    @Override
    public Double calcularPrecio() {
        Double total= 0.0;
        for (Calculable c: contenedor){
            total += c.calcularPrecio();
        }
        return total + this.pesoContenedor;
    }
}
