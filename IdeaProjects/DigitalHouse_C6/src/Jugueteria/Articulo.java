package Jugueteria;

public class Articulo implements CuponAplicable{
    private Double precio;

    public Articulo(Double precio) {
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public Double aplicarCupon(String cupon) {
        if(cupon.equals("cupon15")){
            return getPrecio()*0.85;
        } else if (cupon.equals("cupon30")) {
            return getPrecio()*0.70;
        } else {
            System.out.println("Cupon no valido papi, sale pa' fuera");
        }
        return null;
    }

    @Override
    public String reporte() {
        // mostrar precio: normal, con descuento del 20 y descuento del 30
        return "precio son descuento" + getPrecio()+ " precio con un 20% " + getPrecio()*0.80 + " precio con 30% " + getPrecio()*0.70;
    }
}
