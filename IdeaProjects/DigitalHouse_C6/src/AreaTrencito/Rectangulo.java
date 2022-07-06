package AreaTrencito;

public class Rectangulo implements Calculable{

    private Double alto;
    private Double largo;

    public Rectangulo(Double alto, Double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public Double getArea() {
        return this.alto * this.largo;
    }
}
