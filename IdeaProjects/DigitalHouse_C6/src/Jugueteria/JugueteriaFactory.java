package Jugueteria;

public class JugueteriaFactory {
    private static JugueteriaFactory instancia;
    private JugueteriaFactory(){

    }
    public static JugueteriaFactory getInstance(){
        if(instancia == null){
            instancia = new JugueteriaFactory();
        }
        return instancia;
    }

    public CuponAplicable crearArticulos(String articulo){
        switch (articulo){
            case "Juego de Mesa":
                JuegoDeMesa item1 = new JuegoDeMesa(50.0, "Life", 2, 6);
                return item1;
            case "Juguete":
                Juguete item2 = new Juguete(40.0, "Spiderman", 5);
                return item2;
            case "Disfraz":
                Disfraz item3 = new Disfraz(20.0, "Iron Man", "M");
                return item3;
            case "Combo Navideno":
                ComboComposite combo = new ComboComposite(223344);
                combo.addArticulos(new Juguete(40.0, "Spiderman", 5));
                combo.addArticulos(new Juguete(40.0, "Spiderman", 5));
                combo.addArticulos(new JuegoDeMesa(50.0, "Life", 2, 6));
                combo.addArticulos(new Disfraz(20.0, "Iron Man", "M"));
                return  combo;
            default:
                return null;
        }
    }




}
