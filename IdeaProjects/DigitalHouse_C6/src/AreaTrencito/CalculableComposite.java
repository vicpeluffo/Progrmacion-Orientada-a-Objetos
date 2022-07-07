package AreaTrencito;

import java.util.ArrayList;

public class CalculableComposite implements Calculable{
    //atributo que declara al arreglo
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
    //metodo que añade objetos en el arreglo
    public void addFigura(Calculable c){

        this.figuras.add(c);
    }
}
