package proyectoArma;

public class ArmaLarga extends Arma implements Comparable {
    private boolean selloRenar;
    private String usoJustificado;
    private Integer nivel;

    public ArmaLarga(Integer cantMuniciones, Double alcanceEnMetros, String marca, Double calibre, String estado, Policia policia, boolean selloRenar, String usoJustificado, Integer nivel) {
        super(cantMuniciones, alcanceEnMetros, marca, calibre, estado, policia);
        this.selloRenar = selloRenar;
        this.usoJustificado = usoJustificado;
        this.nivel = nivel;
    }

    public boolean isSelloRenar() {
        return selloRenar;
    }

    public void setSelloRenar(boolean selloRenar) {
        this.selloRenar = selloRenar;
    }

    public String getUsoJustificado() {
        return usoJustificado;
    }

    public void setUsoJustificado(String usoJustificado) {
        this.usoJustificado = usoJustificado;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    @Override
    public boolean serUsada(){
        if (getCalibre()>=9 && getEstado().equals("En Uso")){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public int compareTo(Object o) {
        ArmaLarga armaLarga = (ArmaLarga) o;
        if(this.nivel == ((ArmaLarga) o).getNivel()) {
            return 0;
        } else if(this.nivel > ((ArmaLarga) o).getNivel()){
            return 1;
        }else{
            return 2;
        }
    }
}
