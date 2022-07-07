package Jugueteria;

public class JuegoDeMesa extends Articulo{

    private String nombre;
    private Integer cantJugMin;
    private Integer cantJugMax;

    public JuegoDeMesa(Double precio, String nombre, Integer cantJugMin, Integer cantJugMax) {
        super(precio);
        this.nombre = nombre;
        this.cantJugMin = cantJugMin;
        this.cantJugMax = cantJugMax;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantJugMin() {
        return cantJugMin;
    }

    public void setCantJugMin(Integer cantJugMin) {
        this.cantJugMin = cantJugMin;
    }

    public Integer getCantJugMax() {
        return cantJugMax;
    }

    public void setCantJugMax(Integer cantJugMax) {
        this.cantJugMax = cantJugMax;
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
        return "precio de base: " + getPrecio()+ ", precio con un 20%: " + getPrecio()*0.80 + ", precio con 30%: " + getPrecio()*0.70;
    }

    @Override
    public String toString() {
        return "JuegoDeMesa{" +
                "nombre='" + nombre + '\'' +
                ", cantJugMin=" + cantJugMin +
                ", cantJugMax=" + cantJugMax +
                '}';
    }
}
