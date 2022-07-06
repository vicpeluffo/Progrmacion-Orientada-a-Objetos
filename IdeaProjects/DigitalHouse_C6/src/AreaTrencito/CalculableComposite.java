package AreaTrencito;

import java.util.ArrayList;

public class CalculableComposite implements Calculable{

    private ArrayList<Calculable> figuras = new ArrayList<>();
    private String nombre;

    public CalculableComposite(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Double getArea() {
        Double areaTotal = 0.0;
        for (Calculable c: this.figuras) {
            areaTotal += c.getArea();
        }
        return areaTotal;
    }

    public void addFigura(Calculable c){
        this.figuras.add(c);
    }
}
