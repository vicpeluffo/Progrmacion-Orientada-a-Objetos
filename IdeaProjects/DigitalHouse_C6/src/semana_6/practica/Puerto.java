package semana_6.practica;

import semana_6.lesson_1.Jugador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Puerto implements Comparable<Contenedor>{
    //atributos
    private String nombre;
    private ArrayList<Contenedor> contenedor;

    //constructor

    public Puerto(String nombre) {
        this.nombre = nombre;
        this.contenedor = new ArrayList<Contenedor>();
    }
    public Puerto(String nombre, ArrayList<Contenedor> contenedor) {
        this.nombre = nombre;
        this.contenedor = contenedor;
    }


    //metodos
    public boolean ingresarContenedor(){
        return true;
    }

    public void mostrarIDordenado(){
        Collections.sort(contenedor, new Comparator<Contenedor>() {
            @Override
            public int compare(Contenedor o1, Contenedor o2) {
                return new Integer(o1.getNumeroID().compareTo(new Integer(o2.getNumeroID())));
            }
        });

    }

    public void addContenedor(Contenedor contenedor){
        this.contenedor.add(contenedor);

    }

    public int getCantidadContenedorPeligroso(){
        int cnt =0;
        for (Contenedor x : contenedor){
            if (x.getProcedencia().equals("Desconocido") && x.isMarca()){
                cnt++;
            }
        }
        return cnt;

    }

    @Override
    public String toString() {
        return "Puerto{" +
                "nombre='" + nombre + '\'' +
                ", contenedor=" + contenedor +
                '}';
    }

    @Override
    public int compareTo(Contenedor o) {
        return 0;
    }
}
