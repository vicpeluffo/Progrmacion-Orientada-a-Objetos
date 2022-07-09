package Constructora;

import java.util.ArrayList;

public class Constructora{

    private ArrayList<Cotizable> arreglo;



    public void agregarArreglo (Cotizable x) {
        if (this.arreglo == null) {
            this.arreglo = new ArrayList<>();
        }
        this.arreglo.add(x);
    }



    public void generarInforme() {
        for (Cotizable c : arreglo) {
            System.out.println("Esto es " + c.getClass() + "el precio es de : " + c.cotizar());
        }
    }
//    public void generarReporte(){
//        for(CuponAplicable c: this.productos){
//            System.out.println("El producto " + c.getClass() + " tiene un precio de " + c.getPrecio());
//        }
//    }





}
