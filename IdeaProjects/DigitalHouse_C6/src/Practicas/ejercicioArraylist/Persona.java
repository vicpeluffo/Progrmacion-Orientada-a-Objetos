package Practicas.ejercicioArraylist;

import semana_6.practica.Contenedor;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private ArrayList<Cuenta> cuenta;

    public Persona(String nombre, String apellido, Integer edad, ArrayList<Cuenta> cuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuenta = new ArrayList<Cuenta>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public ArrayList<Cuenta> getCuenta() {
        return cuenta;
    }

    public void setCuenta(ArrayList<Cuenta> cuenta) {
        this.cuenta = cuenta;
    }
    public void addCuenta(Cuenta cuenta){
        this.cuenta.add(cuenta);

    }

    public String getNombreCompleto(){
        return (getNombre() + " " + getApellido());
    }

    public boolean esMayorEdad () {
        if (this.edad >= 60) {
        }
        return true;
    }


    public double getSaldoTotal(){
        return 0.1;
    }

    public void mostrarCuenta(){

    }
}
