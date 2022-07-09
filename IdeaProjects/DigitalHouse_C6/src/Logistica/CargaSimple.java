package Logistica;

public class CargaSimple implements Calculable{

    private String nombre;
    private String descripcion;
    private Double peso;
    private boolean refrigeracion;

    public CargaSimple(String nombre, String descripcion, Double peso, boolean refrigeracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
        this.refrigeracion = refrigeracion;
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

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean isRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(boolean refrigeracion) {
        this.refrigeracion = refrigeracion;
    }

    @Override
    public Double calcularPrecio() {
        if (this.refrigeracion == true) {
            return this.peso * 1.1;
        } else {
            return this.peso;
        }
    }
}
