package Logistica;

public class Test {
    public static void main(String[] args) {

        FactoryCargas fc = FactoryCargas.getInstance();

        Calculable carga1 = fc.crearCarga("TVs");
        Calculable carga2 = fc.crearCarga("medicamentos");
        Calculable carga3 = fc.crearCarga("cargaContenedor");

        System.out.println(carga1.calcularPrecio());
        System.out.println(carga2.calcularPrecio());
        System.out.println(carga3.calcularPrecio());

        Barco c = new Barco();
        c.agregarCarga(carga3);
        c.agregarCarga(carga1);
        c.agregarCarga(carga2);
        c.generarReporte();

    }
}
