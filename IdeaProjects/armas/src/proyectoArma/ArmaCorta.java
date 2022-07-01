package proyectoArma;

import java.util.Collection;

public class ArmaCorta extends Arma{
    private boolean automatica;

    public ArmaCorta(Integer cantMuniciones, Double alcanceEnMetros, String marca, Double calibre, String estado, Policia policia, boolean automatica) {
        super(cantMuniciones, alcanceEnMetros, marca, calibre, estado, policia);
        this.automatica = automatica;
    }

    public boolean isAutomatica() {
        return automatica;
    }

    public void setAutomatica(boolean automatica) {
        this.automatica = automatica;
    }

    @Override
    public boolean serUsada(){
        return false;
    }

    public boolean informarAlcance() {
        if (getAlcanceEnMetros() >= 200) {
            return true;
        } else {
            return false;
        }
    }

}
