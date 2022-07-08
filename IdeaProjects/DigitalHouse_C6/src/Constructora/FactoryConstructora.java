package Constructora;

public class FactoryConstructora {

    private static FactoryConstructora instancia;
    public static FactoryConstructora getInstance(){
        if(instancia == null){
            instancia = new FactoryConstructora();
        }
        return instancia;
    }

    public Cotizable construir(String item){
        switch (item){
            case "Chalet Pareado":
                Casa casa1 = new Casa("Chalet", 200.0, 1500.00, 6);
            return casa1;
            case "Hormigon":
                Piscina piscina1 = new Piscina("Hormigon", 40000.00, "cuadrada", false, 1.10, 30000.00);
            return piscina1;
            case "Home Sweet Home":
                ConstructoraComposite viviendaPremium = new ConstructoraComposite(123456, 0.95);
                viviendaPremium.addItems(new Casa("aislada", 420.00, 3200.00, 10));
                viviendaPremium.addItems(new Piscina("desbordante", 60000.00, "cuadrado", true, 2.10, 30000.00));
                return viviendaPremium;
            default:
                return null;

        }

    }
}
