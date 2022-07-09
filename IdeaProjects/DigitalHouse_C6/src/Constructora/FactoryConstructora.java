package Constructora;

public class FactoryConstructora {

    private static FactoryConstructora instancia;

    private FactoryConstructora(){

    }
    public static FactoryConstructora getInstance(){
        if(instancia == null){
            instancia = new FactoryConstructora();
        }
        return instancia;
    }

    public Cotizable construir(String item){
        switch (item){
            case "Casa":
                Casa casa1 = new Casa("Chalet Pareado", 200.0, 1500.00, 6);
            return casa1;
            case "Piscina":
                Piscina piscina1 = new Piscina("Hormigon", 40000.00, "cuadrada", false, 1.10, 30000.00);
            return piscina1;
            case "Home Sweet Home":
                ViviendaPremium viviendaPremium = new ViviendaPremium(123456, 0.95);
                viviendaPremium.addItems(new Casa("aislada", 420.00, 3200.00, 10));
                viviendaPremium.addItems(new Piscina("desbordante", 60000.00, "cuadrado", true, 2.10, 30000.00));
                return viviendaPremium;
//            case "Constructora":
//                Constructora cons1 = new Constructora();
//                Casa casa2 = new Casa("Chalet Pareado", 200.0, 1500.00, 6);
//                Piscina piscina2 = new Piscina("Hormigon", 40000.00, "cuadrada", false, 1.10, 30000.00);
//                ViviendaPremium viviendaPremium2 = new ViviendaPremium(123456, 0.95);
//                cons1.agregarArreglo(casa2);
//                cons1.agregarArreglo(piscina2);
//                cons1.agregarArreglo(viviendaPremium2);
//                return cons1;
                default:
                return null;
        }

    }
}
