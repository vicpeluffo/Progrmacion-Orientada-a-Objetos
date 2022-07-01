package semana_4.lesson_1;

public class Nave extends ObjetoGrafico{

    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad, int vida){
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }

    public Nave(int posx, int posy, char direccion, double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public void girar(char direccion){
        setDireccion(direccion);

    }
    public void restaVida(int valor){
        if (this.vida > valor){
            this.vida -= valor;
        }
    }
    @Override
    public void irA(int x, int y, char direccion){
        if(direccion == getDireccion()) {
            setPosx(x);
            setPosy(y);
        }else {
            setPosx(x);
            setPosy(y);
            girar(direccion);
        }
    }

    @Override
    public String toString() {
        return "Nave{" + super.toString() +
                "velocidad=" + velocidad +
                ", vida=" + vida +
                '}';
    }
}
