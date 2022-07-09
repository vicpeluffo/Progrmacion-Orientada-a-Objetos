package Practicas.inmobiliaria.src.examen2;

public class Casa implements Calculable {
private String tipoCasa;
private double precioMetroCubierto;
private Integer cantidadMaxAmb;

private double canMetroCuadrado;

//CONSTRUCTOR
    public Casa(String tipoCasa, double precioMetroCubierto, Integer cantidadMaxAmb, double canMetroCuadrado) {
        this.tipoCasa = tipoCasa;
        this.precioMetroCubierto = precioMetroCubierto;
        this.cantidadMaxAmb = cantidadMaxAmb;
        this.canMetroCuadrado = canMetroCuadrado;
    }

 //get y set
    public String getTipoCasa() {
        return tipoCasa;
    }

    public void setTipoCasa(String tipoCasa) {
        this.tipoCasa = tipoCasa;
    }

    public double getPrecioMetroCubierto() {
        return precioMetroCubierto;
    }

    public void setPrecioMetroCubierto(double precioMetroCubierto) {
        this.precioMetroCubierto = precioMetroCubierto;
    }

    public Integer getCantidadMaxAmb() {
        return cantidadMaxAmb;
    }

    public void setCantidadMaxAmb(Integer cantidadMaxAmb) {
        this.cantidadMaxAmb = cantidadMaxAmb;
    }

    public double getCanMetroCuadrado() {
        return canMetroCuadrado;
    }

    public void setCanMetroCuadrado(double canMetroCuadrado) {
        this.canMetroCuadrado = canMetroCuadrado;
    }
    //METODOS

    @Override
    public double precio() {
        return this.precioMetroCubierto * this.canMetroCuadrado;
    }

    @Override // OJOOO
    public String generarInforme() {
        return null;
    }




}
