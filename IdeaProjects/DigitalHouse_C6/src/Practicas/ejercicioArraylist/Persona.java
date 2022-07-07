package Practicas.ejercicioArraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private ArrayList<Cuenta> cuenta = new ArrayList<Cuenta>();

    public Persona(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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
        Double total = 0.0;
        for (Cuenta c: this.cuenta) {
            total += c.getSaldo();
        }
        return total;
    }

    public void mostrarCuenta(){
        for (Cuenta c: this.cuenta) {
            System.out.println(c.getSaldo());
            c.compareTo(this);
            System.out.println(c.getSaldo());
            Collections.sort(cuenta);

        }


    }

}
