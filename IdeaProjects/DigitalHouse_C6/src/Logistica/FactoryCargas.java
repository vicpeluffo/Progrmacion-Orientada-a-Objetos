package Logistica;

public class FactoryCargas {

    private static FactoryCargas instancia;
    private FactoryCargas(){

    }

    public static FactoryCargas getInstance(){
        if(instancia == null){
            instancia = new FactoryCargas();
        }
        return instancia;
    }

    public Calculable crearCarga(String item){
        switch (item){
            case "TVs":
                CargaSimple item1 = new CargaSimple("TV 32' LCD", "television", 3.0, false);
                return item1;
            case "medicamentos":
                CargaSimple item2 = new CargaSimple("Paracetamol", "droga", 2.0, true);
                return item2;
            case "cargaContenedor":
                Contenedor item3 = new Contenedor("contenedor1", "mixCarga", 100.00);
                item3.addCarga(new CargaSimple("TV 32' LCD", "television", 3.0, false));
                item3.addCarga(new CargaSimple("Paracetamol", "droga", 2.0, true));
                return item3;
            default:
                return null;
        }
    }
}
