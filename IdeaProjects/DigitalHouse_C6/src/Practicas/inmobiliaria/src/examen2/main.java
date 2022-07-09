package Practicas.inmobiliaria.src.examen2;

public class main {
    public static void main(String[] args) {
        FactoryConstructor fc = FactoryConstructor.getInstance();
        Calculable casa = fc.construirInmuebles("casa");
        System.out.println(casa.precio());
    }
}
