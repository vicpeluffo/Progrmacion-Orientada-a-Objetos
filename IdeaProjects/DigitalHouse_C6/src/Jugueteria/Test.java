package Jugueteria;

public class Test {
    public static void main(String[] args) {
        JugueteriaFactory jf = JugueteriaFactory.getInstance();
        CuponAplicable art1 = jf.crearArticulos("Juego de Mesa");
        CuponAplicable art2 = jf.crearArticulos("Juguete");
        CuponAplicable combo = jf.crearArticulos("Combo Navideno");

        System.out.println(art1.toString());
        System.out.println(art1.reporte());
        System.out.println("precio con cupon del 15: " + art1.aplicarCupon("cupon15"));
        System.out.println("precio con cupon del 30: " + art1.aplicarCupon("cupon30"));
        //
        System.out.println(art2.toString());
        System.out.println(art2.reporte());
        System.out.println("precio con cupon del 15: " + art2.aplicarCupon("cupon15"));
        System.out.println("precio con cupon del 30: " + art2.aplicarCupon("cupon30"));
        //
        System.out.println(combo.toString());
        System.out.println(combo.reporte());
        System.out.println("precio con cupon del 15: " + combo.aplicarCupon("cupon15"));
        System.out.println("precio con cupon del 30: " + combo.aplicarCupon("cupon30"));
    }
}
