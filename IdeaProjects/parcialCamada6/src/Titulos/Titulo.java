package Titulos;

import java.util.Date;

public abstract class Titulo {
    private Integer materias;
    private Date fechaInicio;
    private Date fechaFin;
    private boolean selloMinisterio;
    private boolean selloInstituto;
    private Persona persona;

    public Titulo(Integer materias, Date fechaInicio, Date fechaFin, boolean selloMinisterio, boolean selloInstituto, Persona persona) {
        this.materias = materias;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.selloMinisterio = selloMinisterio;
        this.selloInstituto = selloInstituto;
        this.persona = persona;
    }

    public Integer getMaterias() {
        return materias;
    }

    public void setMaterias(Integer materias) {
        this.materias = materias;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean getSelloMinisterio() {
        return selloMinisterio;
    }

    public void setSelloMinisterio(boolean selloMinisterio) {
        this.selloMinisterio = selloMinisterio;
    }

    public boolean getSelloInstituto() {
        return selloInstituto;
    }

    public void setSelloInstituto(boolean selloInstituto) {
        this.selloInstituto = selloInstituto;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public abstract boolean ejercer();
}
