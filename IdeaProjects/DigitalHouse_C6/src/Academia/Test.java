package Academia;

public class Test {
    public static void main(String[] args) {

        OfertaAcademicaFactory fabrica = OfertaAcademicaFactory.getInstance();

        OfertaAcademica backend = fabrica.crearOfertaAcademica("backend");

        OfertaAcademica fullstack = fabrica.crearOfertaAcademica("fullstack");

        OfertaAcademica frontend = fabrica.crearOfertaAcademica("frontend");

        System.out.println("curso " + backend.getNombre() + " costo: " + backend.calcularPrecio());
        System.out.println("curso " + fullstack.getNombre() + " costo: " + fullstack.calcularPrecio());
        System.out.println("curso " + frontend.getNombre() + " costo: " + frontend.calcularPrecio());

        Instituto inst = new Instituto();
        inst.agregarOfertas(backend);
        inst.agregarOfertas(frontend);
        inst.agregarOfertas(fullstack);
        inst.generarInforme();


    }
}
