package semana_6.lesson_3;

import semana_6.lesson_1.Jugador;

import java.util.ArrayList;

public class Almacen {

    private ArrayList<Producto> productos;

    public static Producto construir(String medida) throws Exception {
        if (medida.equalsIgnoreCase("caja10x10")){
            return new Caja(2.3, 3.0, 4.0, 1.0);
        } else if (medida.equalsIgnoreCase("pelotaFutbol")){
            return new Pelota(0.8, 11.0);
        } else{
            throw new Exception("invalido");
        }

    }

    public void addProducto(Producto productos){
        this.productos.add(productos);

    }

    public Double calcularEspacioNecesario(){
        Double total = 0.0;
        for (Producto p: this.productos)
            total += p.calcularEspacio();
        return total;

    }


}
