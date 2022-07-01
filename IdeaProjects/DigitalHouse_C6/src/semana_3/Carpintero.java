package semana_3;

public class Carpintero {
    private String nombre;

    public Carpintero(String nombre) {
        this.nombre = nombre;
    }

    public void usarHerramienta(Martillo martilloTipo1){
        System.out.println("Soy el carpintero " + this.nombre + "y estoy usando el martillo");
        martilloTipo1.martillar();
    }
}
