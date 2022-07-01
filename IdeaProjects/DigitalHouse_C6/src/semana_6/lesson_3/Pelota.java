package semana_6.lesson_3;

public class Pelota extends Producto {
    private double radio;
    private Double peso;

    public Pelota(Double peso, double radio) {
        super(peso);
        this.radio = radio;
    }

    public Pelota() {
    }

    @Override
    public Double getPeso() {
        return peso;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularEspacio() {
        return this.radio*this.radio*this.radio * (3/4) * Math.PI;
    }


}
