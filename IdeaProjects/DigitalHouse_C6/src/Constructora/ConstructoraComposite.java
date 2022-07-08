package Constructora;

import java.util.ArrayList;

public class ConstructoraComposite implements Cotizable{

    private Integer codigo;
    private Double bonificacion;

    private ArrayList<Cotizable> premium = new ArrayList<Cotizable>();

    public ConstructoraComposite(Integer codigo, Double bonificacion) {
        this.codigo = codigo;
        this.bonificacion = bonificacion;
    }

    public void addItems(Cotizable c){
        this.premium.add(c);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Cotizable> getPremium() {
        return premium;
    }

    public void setPremium(ArrayList<Cotizable> premium) {
        this.premium = premium;
    }

    public Double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(Double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public Double cotizar() {
        Double total = 0.0;
        for (Cotizable c: premium){
            total += c.cotizar();
        }
        return total*this.bonificacion;

    }

    @Override
    public String generarInforme() {
        return "ConstructoraComposite{" +
                "codigo=" + codigo +
                ", bonificacion=" + bonificacion +
                ", premium=" + premium +
                '}';
    }

}
