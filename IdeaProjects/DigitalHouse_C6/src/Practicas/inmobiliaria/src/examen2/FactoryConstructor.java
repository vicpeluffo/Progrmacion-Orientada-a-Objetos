package Practicas.inmobiliaria.src.examen2;

public class FactoryConstructor {
    // siempre es igual  // este es el singelton
private static FactoryConstructor instancia;
public static FactoryConstructor getInstance(){
    if (instancia == null){
        instancia = new FactoryConstructor();
    }
    return instancia;
}
public Calculable construirInmuebles (String inmueble){
    switch (inmueble) {
        case "casa":
            Casa casa2 = new Casa("home sweet", 1500, 6, 200);
            return casa2;

        case "piscina":
            Piscina piscina2 = new Piscina("desbordante", 60000, "cuadrada", false, 2.1, 0);
            return piscina2;

        case "Viviendapremium":
            Casa casa3 = new Casa("home sweet", 3200, 2, 420);
            Piscina piscina3 = new Piscina("desbordante", 60000, "cuadrada", false, 2.1, 0);
            PaquetePremium paquetePremium = new PaquetePremium("home sweet home", 5);
            ViviendaPremium viviendaPremium2 = new ViviendaPremium(casa3, piscina3, paquetePremium);
            return viviendaPremium2;
        default:return  null;
    }

    }
}

