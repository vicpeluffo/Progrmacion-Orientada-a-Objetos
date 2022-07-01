package semana_4.lesson_3;

import java.util.Date;

public class ImpresoraEpson extends Impresora {
    public ImpresoraEpson(String modelo, String tipoConexion, Date fechaFabricacion, int hojasDisponibles, double porcentajeTinta) {
        super(modelo, tipoConexion, fechaFabricacion, hojasDisponibles, porcentajeTinta);
    }

    @Override
    public String getModelo() {
        return super.getModelo();
    }

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    @Override
    public String getTipoConexion() {
        return super.getTipoConexion();
    }

    @Override
    public void setTipoConexion(String tipoConexion) {
        super.setTipoConexion(tipoConexion);
    }

    @Override
    public void setFechaFabricacion(Date fechaFabricacion) {
        super.setFechaFabricacion(fechaFabricacion);
    }

    @Override
    public int getHojasDisponibles() {
        return super.getHojasDisponibles();
    }

    @Override
    public void setHojasDisponibles(int hojasDisponibles) {
        super.setHojasDisponibles(hojasDisponibles);
    }

    @Override
    public double getPorcentajeTinta() {
        return super.getPorcentajeTinta();
    }

    @Override
    public void setPorcentajeTinta(double porcentajeTinta) {
        super.setPorcentajeTinta(porcentajeTinta);
    }

    @Override
    public boolean tienePapel(){
        return true;
    }

    @Override
    public boolean necesitaTinta() {
        return false;
    }

    @Override
    public String imprimir() {
        return null;
    }

    @Override
    public Date getFechaFabricacion() {
        return super.getFechaFabricacion();
    }

}
