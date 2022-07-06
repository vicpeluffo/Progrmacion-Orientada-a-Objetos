package AreaTrencito;

public class Triangulo implements Calculable{

    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public Double getArea() {
        return (this.altura * this.base)/2;
    }
}
