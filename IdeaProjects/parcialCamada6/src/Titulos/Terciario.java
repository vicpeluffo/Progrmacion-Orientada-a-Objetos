package Titulos;

import java.util.Date;

public class Terciario extends Titulo{

    private String validez;

    public Terciario(Integer materias, Date fechaInicio, Date fechaFin, boolean selloMinisterio, boolean selloInstituto, Persona persona, String validacion) {
        super(materias, fechaInicio, fechaFin, selloMinisterio, selloInstituto, persona);
        this.validez = validacion;
    }

    public String getValidez() {
        return validez;
    }

    public void setValidez(String validez) {
        this.validez = validez;
    }
    @Override
    public boolean ejercer() {
        if (getSelloInstituto() && getSelloMinisterio()) {
            return true;
        } else {
            return false;
        }
    }
    public boolean validezNacional(){
        if(this.validez.equals("NACIONAL")){
            return true;
        } else{
            return false;
        }
    }
}
