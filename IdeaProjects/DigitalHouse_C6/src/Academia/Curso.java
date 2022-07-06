package Academia;

public class Curso  extends  OfertaAcademica{
    private Double cantHoras;
    private Integer cantMeses;
    private Double valorXHora;

    public Curso(String nombre, String descripcion, Double cantHoras, Integer cantMeses, Double valorXHora) {
        super(nombre, descripcion);
        this.cantHoras = cantHoras;
        this.cantMeses = cantMeses;
        this.valorXHora = valorXHora;
    }


    @Override
    public Double calcularPrecio() {
        return this.cantHoras * this.cantMeses * this.valorXHora;
    }
}
