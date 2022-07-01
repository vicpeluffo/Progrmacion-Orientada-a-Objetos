package semana_6.lesson_1;

public class Jugador {

    private int numeroCamiseta;
    private String nombre;
    private boolean lesionado;
    private boolean titular;

    public Jugador(int numeroCamiseta, String nombre, boolean lesionado, boolean titular) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }
    @Override
    public String toString(){
        return ("nombre: " + this.nombre + "numero: " + this.numeroCamiseta);
    }
}
