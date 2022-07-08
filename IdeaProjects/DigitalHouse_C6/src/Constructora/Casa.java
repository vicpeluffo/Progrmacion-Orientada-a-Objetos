package Constructora;

public class Casa implements Cotizable{

    private String tipo;
    private Double mtCdos;
    private Double precioMtCdos;
    private Integer cantMaxAmb;

    public Casa(String tipo, Double mtCdos, Double precioMtCdos, Integer cantMaxAmb) {
        this.tipo = tipo;
        this.mtCdos = mtCdos;
        this.precioMtCdos = precioMtCdos;
        this.cantMaxAmb = cantMaxAmb;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getMtCdos() {
        return mtCdos;
    }

    public void setMtCdos(Double mtCdos) {
        this.mtCdos = mtCdos;
    }

    public Double getPrecioMtCdos() {
        return precioMtCdos;
    }

    public void setPrecioMtCdos(Double precioMtCdos) {
        this.precioMtCdos = precioMtCdos;
    }

    public Integer getCantMaxAmb() {
        return cantMaxAmb;
    }

    public void setCantMaxAmb(Integer cantMaxAmb) {
        this.cantMaxAmb = cantMaxAmb;
    }

    @Override
    public Double cotizar() {
        return this.mtCdos * this.precioMtCdos;
    }

    @Override
    public String generarInforme() {
        return "Casa{" +
                "tipo='" + tipo + '\'' +
                this.cotizar() +
                '}';
    }

}
