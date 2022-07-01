package proyectoArma;

public abstract class Arma {
    private Integer cantMuniciones;
    private Double alcanceEnMetros;
    private String marca;
    private Double calibre;
    private String estado;
    private Policia policia;

    public Arma(Integer cantMuniciones, Double alcanceEnMetros, String marca, Double calibre, String estado, Policia policia) {
        this.cantMuniciones = cantMuniciones;
        this.alcanceEnMetros = alcanceEnMetros;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
        this.policia = policia;
    }

    public Integer getCantMuniciones() {
        return cantMuniciones;
    }

    public void setCantMuniciones(Integer cantMuniciones) {
        this.cantMuniciones = cantMuniciones;
    }

    public Double getAlcanceEnMetros() {
        return alcanceEnMetros;
    }

    public void setAlcanceEnMetros(Double alcanceEnMetros) {
        this.alcanceEnMetros = alcanceEnMetros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getCalibre() {
        return calibre;
    }

    public void setCalibre(Double calibre) {
        this.calibre = calibre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Policia getPolicia() {
        return policia;
    }

    public void setPolicia(Policia policia) {
        this.policia = policia;
    }

    public abstract boolean serUsada();

}
