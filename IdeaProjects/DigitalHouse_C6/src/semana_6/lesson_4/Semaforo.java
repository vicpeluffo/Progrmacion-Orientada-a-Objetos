package semana_6.lesson_4;

public class Semaforo {
    private StateSemaforo estado;

    public Semaforo(){
        setEstado(new Verde(this));
    }

    public StateSemaforo getEstado(){
        return estado;
    }

    public void setEstado(StateSemaforo estado){
        this.estado = estado;
    }
}
