package semana_6.practica;

import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Puerto BuenosAires = new Puerto("Santa Maria del Buen Ayre");

        Contenedor Fedex = new Contenedor(3, "China", false);
        Contenedor DHL = new Contenedor(7, "Rusia", false);
        Contenedor UPS = new Contenedor(4, "Brasil", true);
        Contenedor Triton = new Contenedor(12, "Desconocido", true);


        BuenosAires.addContenedor(Fedex);
        BuenosAires.addContenedor(DHL);
        BuenosAires.addContenedor(UPS);
        BuenosAires.addContenedor(Triton);
        System.out.println(BuenosAires.toString());
        BuenosAires.mostrarIDordenado();

        System.out.println(BuenosAires.toString());
        System.out.println("Cantidad de Contenedor peligroso: " + BuenosAires.getCantidadContenedorPeligroso());

    }
}
