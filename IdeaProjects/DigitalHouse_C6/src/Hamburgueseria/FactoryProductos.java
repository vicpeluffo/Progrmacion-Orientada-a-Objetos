package Hamburgueseria;

public class FactoryProductos {
    private static FactoryProductos instancia;

    private FactoryProductos(){

    }
    public static FactoryProductos getInstance(){
        if (instancia == null){
            instancia = new FactoryProductos();
        }
        return instancia;
    }

    public Comprable crearProductoComprable(String nombreComprable){
        switch(nombreComprable){
            case "premium":
                Sandwich sandwich = new Sandwich("doble queso", 12.5);
                Acompaniamiento papas = new Acompaniamiento("papas", 10.2, "grande");
                Acompaniamiento bebida = new Acompaniamiento("bebida", 8.75, "grande");
                ComboComposite premium = new ComboComposite("premium");
                premium.addProducto(sandwich);
                premium.addProducto(papas);
                premium.addProducto(bebida);
                return premium;

            case "doble queso":
                Sandwich sandwich2 = new Sandwich("doble queso", 12.5);
                return sandwich2;
            case "coca":
                return new Acompaniamiento("cocacola", 4.6, "grande" );
            default:
                return null;
        }

    }
}
