package Hamburgueseria;

public class Test {
    public static void main(String[] args) {
        FactoryProductos fac = FactoryProductos.getInstance();
        Comprable dobleQueso =  fac.crearProductoComprable("doble queso");
        System.out.println("precio: " + dobleQueso.getPrecio());

        Comprable combo = fac.crearProductoComprable("premium");
        System.out.println("precio: " + combo.getPrecio());
    }
}
