package Practicas.inmobiliaria.src.examen2;

public class Piscina implements Calculable{
    private String tipoPiscina;
    private  double cantidadLitros;
    private String forma;
    private  boolean iluminacion;
    private double precioaLitro;
    private double precioIluminacion;

    //CONSTRUCTOR


    public Piscina(String tipoPiscina, double cantidadLitros, String forma, boolean iluminacion, double precioaLitro, double precioIluminacion) {
        this.tipoPiscina = tipoPiscina;
        this.cantidadLitros = cantidadLitros;
        this.forma = forma;
        this.iluminacion = iluminacion;
        this.precioaLitro = precioaLitro;
        this.precioIluminacion = precioIluminacion;
    }

    // GET Y SET


    public String getTipoPiscina() {
        return tipoPiscina;
    }

    public void setTipoPiscina(String tipoPiscina) {
        this.tipoPiscina = tipoPiscina;
    }

    public double getCantidadLitros() {
        return cantidadLitros;
    }

    public void setCantidadLitros(double cantidadLitros) {
        this.cantidadLitros = cantidadLitros;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public boolean isIluminacion() {
        return iluminacion;
    }

    public void setIluminacion(boolean iluminacion) {
        this.iluminacion = iluminacion;
    }

    public double getPrecioaLitro() {
        return precioaLitro;
    }

    public void setPrecioaLitro(double precioaLitro) {
        this.precioaLitro = precioaLitro;
    }

    public double getPrecioIluminacion() {
        return precioIluminacion;
    }

    public void setPrecioIluminacion(double precioIluminacion) {
        this.precioIluminacion = precioIluminacion;
    }

    //METODOS

    @Override
    public double precio() {
        if(iluminacion){
            return this.cantidadLitros * this.precioaLitro + this.precioIluminacion;
        }
        else{
            return this.cantidadLitros * this.precioaLitro;
        }

    }

    @Override
    public String generarInforme() {
        return null;
    }



}
