package semana_6.practica;

public class Contenedor {
    private Integer numeroID;
    private String procedencia;
    private boolean marca;

    public Contenedor(Integer numeroID, String procedencia, boolean marca) {
        this.numeroID = numeroID;
        this.procedencia = procedencia;
        this.marca = marca;
    }

    public Integer getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(Integer numeroID) {
        this.numeroID = numeroID;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public boolean isMarca() {
        return marca;
    }

    public void setMarca(boolean marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "numeroID=" + numeroID +
                ", procedencia='" + procedencia + '\'' +
                ", marca=" + marca +
                '}';
    }
}
