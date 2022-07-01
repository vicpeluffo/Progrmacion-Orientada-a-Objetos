package Titulos;

import java.util.Date;

public class Licenciatura extends Titulo implements Comparable {
    private Integer temaTesis;
    private Date fechaEntrega;
    private Integer trabajosInvestigacion;


    public Licenciatura(Integer materias, Date fechaInicio, Date fechaFin, boolean selloMinisterio, boolean selloInstituto, Persona persona, Integer temaTesis, Date fechaEntrega, Integer trabajosInvestigacion) {
        super(materias, fechaInicio, fechaFin, selloMinisterio, selloInstituto, persona);
        this.temaTesis = temaTesis;
        this.fechaEntrega = fechaEntrega;
        this.trabajosInvestigacion = trabajosInvestigacion;
    }
    @Override
    public boolean ejercer() {
        if (getSelloInstituto() && getSelloMinisterio()) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public int compareTo(Object o) {
        Licenciatura licenciatura = (Licenciatura) o;
        if(this.trabajosInvestigacion == ((Licenciatura) o).trabajosInvestigacion){
            return 0;
        } else if(this.trabajosInvestigacion > ((Licenciatura) o).trabajosInvestigacion){
            return 1;
        } else{
            return 2;
        }

    }
}
