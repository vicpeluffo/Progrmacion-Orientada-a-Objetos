package AreaTrencito;


public class FactoryFiguras {

    private static FactoryFiguras instancia;

    public static FactoryFiguras getInstance(){
        if (instancia == null){
            instancia = new FactoryFiguras();
        }
        return instancia;
    }

    public Calculable crearTrencito(String figura) throws Exception{
        if(figura.equalsIgnoreCase("vagon")){
            Rectangulo rectangulo = new Rectangulo(5.0, 4.0);;
            Circulo circulo1 = new Circulo(1.0);
            Circulo circulo2 = new Circulo(1.0);
            Circulo circulo3 = new Circulo(1.0);
            CalculableComposite tren = new CalculableComposite("vagon");
            tren.addFigura(rectangulo);
            tren.addFigura(circulo1);
            tren.addFigura(circulo2);
            tren.addFigura(circulo3);
            return tren;
        } else if (figura.equalsIgnoreCase("locomotora")){
            Rectangulo rectangulo2 = new Rectangulo(6.0, 4.0);
            Rectangulo rectangulo3 = new Rectangulo(3.0, 4.0);
            Rectangulo rectangulo4 = new Rectangulo(3.0, 2.0);
            Circulo circulo4 = new Circulo(1.0);
            Circulo circulo5 = new Circulo(1.0);
            Triangulo triangulo = new Triangulo(2.0, 2.0);
            CalculableComposite locomotora = new CalculableComposite("locomotora");
            locomotora.addFigura(rectangulo2);
            locomotora.addFigura(rectangulo3);
            locomotora.addFigura(rectangulo4);
            locomotora.addFigura(circulo4);
            locomotora.addFigura(circulo5);
            locomotora.addFigura(triangulo);
            return locomotora;
        }
        else throw new Exception("Invalido");

    }
}
