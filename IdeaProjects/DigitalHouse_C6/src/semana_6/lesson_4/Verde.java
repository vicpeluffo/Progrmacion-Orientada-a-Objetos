package semana_6.lesson_4;

public class Verde implements StateSemaforo{

    private Semaforo semaforo;
    //constructor
    public Verde(Semaforo semaforo){
        this.semaforo = semaforo;

    }
    @Override
    public void mostrarAviso() {
        System.out.println("verde: avanzar");

    }

    @Override
    public void cambiarEstado() {
        semaforo.setEstado(new Amarillo(semaforo));

    }
}
