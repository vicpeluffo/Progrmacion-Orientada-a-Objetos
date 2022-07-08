package Constructora;

public class Test {
    public static void main(String[] args) {

        FactoryConstructora fc = FactoryConstructora.getInstance();

        Cotizable casa = fc.construir("Chalet Pareado");
        Cotizable piscina = fc.construir("Hormigon");
        Cotizable viviendaPremium = fc.construir("Home Sweet Home");

        System.out.println(casa.generarInforme());
        System.out.println(casa.cotizar());

        System.out.println(piscina.generarInforme());
        System.out.println(piscina.cotizar());

        System.out.println("Home Sweet Home: " + viviendaPremium.cotizar());



    }
}
