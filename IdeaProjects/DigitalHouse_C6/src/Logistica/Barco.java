package Logistica;

import Constructora.Cotizable;

import java.util.ArrayList;

public class Barco {

    private String nombre;
    private ArrayList<Calculable> barco;

    public void agregarCarga (Calculable x){
        if (this.barco == null){
            this.barco = new ArrayList<>();
        }
        this.barco.add(x);
    }

    public void generarReporte(){
        for (Calculable c: barco){
            System.out.println("La carga: " + c.getNombre() + " tiene un peso de: " + c.calcularPrecio());
        }
    }
}
