package semana_6.lesson_3;

public abstract class Producto {
    private Double peso;

    public Producto(Double peso) {
        this.peso = peso;
    }

    public Producto() {
    }

    public Double getPeso() {
        return peso;
    }

    public abstract double calcularEspacio();

}


