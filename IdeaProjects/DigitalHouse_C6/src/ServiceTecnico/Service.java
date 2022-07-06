package ServiceTecnico;

import semana_6.CarritoDeCompras.StateCarrito;

public class Service {
    private String nombreArticulo;
    private Double costo;
    private String direccionEntrega;
    private StateService estado;

    public Service(String nombreArticulo, Double costo, String direccionEntrega) {
        this.nombreArticulo = nombreArticulo;
        this.costo = costo;
        this.direccionEntrega = direccionEntrega;
    }

    public void setEstado(StateService estado){
        this.estado = estado;

    }



}
