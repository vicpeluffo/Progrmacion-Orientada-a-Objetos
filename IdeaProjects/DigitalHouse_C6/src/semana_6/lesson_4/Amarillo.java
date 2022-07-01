package semana_6.lesson_4;

public class Amarillo implements StateSemaforo{
    private Semaforo semaforo;
    //constructor
    public Amarillo(Semaforo semaforo){
        this.semaforo = semaforo;

    }

    @Override
    public void mostrarAviso() {
        System.out.println("amarillo: precaucion");

    }

    @Override
    public void cambiarEstado() {
        semaforo.setEstado(new Rojo(semaforo));

    }
}
