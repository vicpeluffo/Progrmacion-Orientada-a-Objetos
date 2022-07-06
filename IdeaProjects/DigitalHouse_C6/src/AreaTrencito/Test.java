package AreaTrencito;

public class Test {
    public static void main(String[] args) throws Exception {
        FactoryFiguras fg = FactoryFiguras.getInstance();
        System.out.println("area locomotora: " + fg.crearTrencito("locomotora").getArea());
        System.out.println("area vagon: " + fg.crearTrencito("vagon").getArea());
        System.out.println("area tren completo: " + (fg.crearTrencito("locomotora").getArea() + fg.crearTrencito("vagon").getArea() + fg.crearTrencito("vagon").getArea()));
    }
}
