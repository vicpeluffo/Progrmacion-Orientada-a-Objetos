package Practicas.inmobiliaria.src.examen2;

public class PaquetePremium {

    private String nombreModelo;
    private double porcentajeBonificacion;

    //const

    public PaquetePremium(String nombreModelo, double porcentajeBonificacion) {
        this.nombreModelo = nombreModelo;
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    //get y set

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public double getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    public void setPorcentajeBonificacion(double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }
}
