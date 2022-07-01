package semana_2;

public class Perros {
    private Boolean estadoAdopcion;
    private String raza;
    private int añoNacimiento;
    private double peso;
    private Boolean tieneChip;
    private Boolean estaLastimado;
    private String nombre;

    public Perros(Boolean estadoAdopcion, String raza, int añoNacimiento, double peso, Boolean tieneChip, Boolean estaLastimado, String nombre) {
        this.estadoAdopcion = estadoAdopcion;
        this.raza = raza;
        this.añoNacimiento = añoNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.nombre = nombre;
    }

    public Perros(Boolean estadoAdopcion, int añoNacimiento, double peso, Boolean tieneChip, Boolean estaLastimado) {
        this.estadoAdopcion = estadoAdopcion;
        this.añoNacimiento = añoNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
    }

    public Boolean getEstadoAdopcion() {
        return estadoAdopcion;
    }

    public void setEstadoAdopcion(Boolean estadoAdopcion) {
        this.estadoAdopcion = estadoAdopcion;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Boolean getTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(Boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public Boolean getEstaLastimado() {
        return estaLastimado;
    }

    public void setEstaLastimado(Boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public int calcularEdad(int añoNacimiento){
        return 2022 - this.añoNacimiento;
    }

    public void verificarPerderse (){
        if(tieneChip){
            System.out.println("El perro no se puede perder");
        } else {
            System.out.println("El perro se puede perder");
        }
    }
    public void verificarAdopcion(){
        if (estadoAdopcion == false && tieneChip!= false && peso>= 5){
            System.out.println("El perro puede ser adoptado");
        } else {
            System.out.println("El perro no puede ser adoptado");
        }
    }
}
