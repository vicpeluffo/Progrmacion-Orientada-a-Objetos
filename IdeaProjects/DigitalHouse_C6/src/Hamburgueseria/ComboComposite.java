package Hamburgueseria;

import java.util.ArrayList;

public class ComboComposite implements Comprable{

    private ArrayList<Comprable> productos;

    private String nombre;

    public ComboComposite(String nombre){
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }


    @Override
    public Double getPrecio() {
        Double valorTotal = 0.0;
        for (Comprable c: this.productos) {
            valorTotal+= c.getPrecio();
        }
        return valorTotal;
    }

    public void addProducto(Comprable c){
        this.productos.add(c);
    }
}
