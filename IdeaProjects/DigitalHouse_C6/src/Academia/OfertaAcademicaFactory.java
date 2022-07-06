package Academia;

public class OfertaAcademicaFactory {

    private static OfertaAcademicaFactory instancia;

    private OfertaAcademicaFactory(){

    }
    //singleton
    public static OfertaAcademicaFactory getInstance(){
        if (instancia == null){
            instancia = new OfertaAcademicaFactory();
        }
        return instancia;
    }

    //factory
    public OfertaAcademica crearOfertaAcademica(String ofertaAcademica){
        switch (ofertaAcademica){
            case "backend":
                return  new Curso("backend", "", 20.0, 2, 900.0);
            case "frontend":
                return new Curso("frontend", "", 16.0, 2, 1000.0);
            case "fullstack":
                Curso backend2 = new Curso("backend", "", 20.0, 2, 900.0);
                Curso frontend = new  Curso("frontend", "", 16.0, 2, 1000.0);
                Programa fullstack = new Programa("fullstack", "", 0.20);
                fullstack.agregarCurso(backend2);
                fullstack.agregarCurso(frontend);
                return fullstack;
            default:
                return null;
        }
    }

}
