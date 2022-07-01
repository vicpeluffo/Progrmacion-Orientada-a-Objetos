package semana_6.CarritoDeCompras;

public class Program {
    public static void main(String[] args) {
        Producto prod1 = new Producto("algo", 200.0);
        Producto prod2 = new Producto("cama", 150.0);

        Carrito carroMartin = new Carrito();
        System.out.println(carroMartin.getEstado().mostrarEstado());
        carroMartin.addProducto(prod1);
        System.out.println(carroMartin.getEstado().mostrarEstado());
        carroMartin.vaciarCarrito();
        System.out.println(carroMartin.getEstado().mostrarEstado());
        carroMartin.getEstado().cambiarEstado();
        System.out.println(carroMartin.getEstado().mostrarEstado());




    }
}
