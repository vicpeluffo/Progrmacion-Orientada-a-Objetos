package Jugueteria;

public class Disfraz extends Articulo{

    private String descripcion;
    private String talle;

    public Disfraz(Double precio, String descripcion, String talle) {
        super(precio);
        this.descripcion = descripcion;
        this.talle = talle;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
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
        return "precio de base: " + getPrecio()+ ", precio con un 20% " + getPrecio()*0.80 + ", precio con 30% " + getPrecio()*0.70;
    }

    @Override
    public String toString() {
        return "Disfraz{" +
                "descripcion='" + descripcion + '\'' +
                ", talle='" + talle + '\'' +
                '}';
    }
}
