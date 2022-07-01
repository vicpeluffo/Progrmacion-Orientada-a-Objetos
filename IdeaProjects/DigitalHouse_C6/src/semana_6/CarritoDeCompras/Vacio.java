package semana_6.CarritoDeCompras;

public class Vacio implements StateCarrito{

    private Carrito carrito;

    public Vacio(Carrito carrito){
        this.carrito = carrito;

    }

    @Override
    public void cambiarEstado() {
        carrito.setEstado(new Cargando(carrito));

    }

    public String mostrarEstado (){
        return "Vacio";
    }
}
