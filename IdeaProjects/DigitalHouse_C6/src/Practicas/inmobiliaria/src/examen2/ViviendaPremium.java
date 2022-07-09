package Practicas.inmobiliaria.src.examen2;

public class ViviendaPremium implements Calculable{

    private Casa casa;
    private Piscina piscina;
    private PaquetePremium paquetePremium;

    // const

    public ViviendaPremium(Casa casa, Piscina piscina, PaquetePremium paquetePremium) {
        this.casa = casa;
        this.piscina = piscina;
        this.paquetePremium = paquetePremium;
    }

    // get y set


    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public Piscina getPiscina() {
        return piscina;
    }

    public void setPiscina(Piscina piscina) {
        this.piscina = piscina;
    }

    public PaquetePremium getPaquetePremium() {
        return paquetePremium;
    }

    public void setPaquetePremium(PaquetePremium paquetePremium) {
        this.paquetePremium = paquetePremium;
    }

    @Override
    public double precio() {
        return  (casa.precio()+piscina.precio()) * paquetePremium.getPorcentajeBonificacion();
    }

    @Override
    public String generarInforme() {
        return null;
    }
}
