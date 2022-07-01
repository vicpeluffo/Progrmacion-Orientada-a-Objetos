package semana_6.lesson_4;

public class Rojo implements StateSemaforo{

    private Semaforo semaforo;
    //constructor
    public Rojo(Semaforo semaforo){
        this.semaforo = semaforo;

    }

    @Override
    public void mostrarAviso() {
        System.out.println("rojo: no avanzar");

    }

    @Override
    public void cambiarEstado() {
        semaforo.setEstado(new Verde(semaforo));

    }
}
