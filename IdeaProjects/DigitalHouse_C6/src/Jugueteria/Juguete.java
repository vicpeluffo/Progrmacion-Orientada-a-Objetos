package Jugueteria;

public class Juguete extends Articulo{
    private String nombre;
    private Integer edadMin;

    public Juguete(Double precio, String nombre, Integer edadMin) {
        super(precio);
        this.nombre = nombre;
        this.edadMin = edadMin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(Integer edadMin) {
        this.edadMin = edadMin;
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
        return "precio de base: " + getPrecio()+ ", precio con un 20%: " + getPrecio()*0.80 + ", precio con 30%:  " + getPrecio()*0.70;
    }


    @Override
    public String toString() {
        return "Juguete{" +
                "nombre='" + nombre + '\'' +
                ", edadMin=" + edadMin +
                '}';
    }
}
