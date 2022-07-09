package Constructora;

public class Piscina implements Cotizable{

    private String tipo;
    private Double cantLt;
    private String forma;
    private boolean iluminacion;
    private Double precioLt;
    private Double precioIluminacion;

    public Piscina(String tipo, Double cantLt, String forma, boolean iluminacion, Double precioLt, Double precioIluminacion) {
        this.tipo = tipo;
        this.cantLt = cantLt;
        this.forma = forma;
        this.iluminacion = iluminacion;
        this.precioLt = precioLt;
        this.precioIluminacion = precioIluminacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getCantLt() {
        return cantLt;
    }

    public void setCantLt(Double cantLt) {
        this.cantLt = cantLt;
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

    public Double getPrecioLt() {
        return precioLt;
    }

    public void setPrecioLt(Double precioLt) {
        this.precioLt = precioLt;
    }

    public Double getPrecioIluminacion() {
        return precioIluminacion;
    }

    public void setPrecioIluminacion(Double precioIluminacion) {
        this.precioIluminacion = precioIluminacion;
    }


    @Override
    public Double cotizar() {
        Double total = 0.0;
        total = this.cantLt*this.precioLt;
        if (this.iluminacion == true){
            total += this.precioIluminacion;
        }
        return  total;
    }

//    @Override
//    public String generarInforme() {
////        return "Piscina{" +
////                "tipo='" + tipo + '\'' + this.cotizar() +
////                '}';
//        return "esto es una prueba mala";
//    }


    @Override
    public String toString() {
        return "Piscina{" +
                "tipo='" + tipo + '\'' +
                ", precio=" + cotizar() +
                '}';
    }
}
