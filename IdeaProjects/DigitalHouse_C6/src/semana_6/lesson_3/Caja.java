package semana_6.lesson_3;

public class Caja extends Producto{
    private Double longitud;
    private Double ancho;
    private Double altura;
    private Double peso;

    public Caja(Double peso, Double longitud, Double ancho, Double altura) {
        super(peso);
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }
    public Caja(){

    }

    @Override
    public Double getPeso() {
        return peso;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularEspacio() {
        return this.altura * this.ancho * this.longitud;
    }


    public String hola(){
        return "hola";
    }


}
