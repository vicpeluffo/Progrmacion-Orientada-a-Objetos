package Practicas.inmobiliaria.src.examen2;

import java.util.ArrayList;

public class CompositeConstructora implements Calculable {
    private ArrayList<Calculable> inmueble = new ArrayList<>();
    public void addInmueble(Calculable c){
        inmueble.add(c);
    }

    @Override
    public double precio() {
        double total = 0;
        for (Calculable c: inmueble){
            total += c.precio();
        }
        return total;
    }

    @Override
    public String generarInforme() {
        return null;
    }
}
