package AreaTrencito;

public class Circulo implements Calculable{

    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }


    @Override
    public Double getArea() {
        return this.radio * this.radio * Math.PI;
    }
}
