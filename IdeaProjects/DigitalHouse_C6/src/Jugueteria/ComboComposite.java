package Jugueteria;

import java.util.ArrayList;


public class ComboComposite implements CuponAplicable {

    private ArrayList<Articulo> grupo = new ArrayList<Articulo>();
    private Integer codigo;

    public ComboComposite(Integer codigo){
        this.codigo = codigo;
    }

    public void addArticulos(Articulo a){
        this.grupo.add(a);
    }

    public Double getPrecio(){
        Double total = 0.0;
        for (Articulo a: grupo){
            total += a.getPrecio();
        }
        return total*0.85;
    }


    @Override
    public Double aplicarCupon(String cupon) {
        if(cupon.equals("cupon15")){
            return getPrecio()*0.85;
        } else if (cupon.equals("cupon30")) {
            return getPrecio()*0.70;
        } else {
            System.out.println("Cupon no valido papi, sale pa' fuera");
        }
        return null;
    }

    @Override
    public String reporte() {
        // mostrar precio: normal, con descuento del 20 y descuento del 30
        return "precio de base: " + getPrecio()+ ", precio con un 20%:  " + getPrecio()*0.80 + ", precio con 30%: " + getPrecio()*0.70;
    }

    @Override
    public String toString() {
        return "ComboComposite{" +
                "grupo=" + grupo +
                ", codigo=" + codigo +
                '}';
    }
}
