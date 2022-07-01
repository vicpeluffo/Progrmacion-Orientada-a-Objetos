package Practicas.SeleccionFutbol;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> plantel; //0 a 10 titulares; 11 a 17 suplentes; 18 a 22 reserva.

    public Equipo (String nombre){
        this.nombre = nombre;
        this.plantel = new ArrayList<>();
    }

    public void addJugador(Jugador jugador){
        this.plantel.add(jugador);
    }

    public ArrayList<Jugador> obtenerReservas(){
        ArrayList<Jugador> reservas = new ArrayList<>();
        for (int i=18; i<this.plantel.size();i++){
            reservas.add(this.plantel.get(i));
        }
        return reservas;

    }

    public Integer cantJugador(String posicion){
        Integer cantidadJugadoresEnPosicion = 0;
        for (Jugador jugador: this.plantel){
            if (jugador.getPosicion() == posicion){
                cantidadJugadoresEnPosicion++;
            }
        }
        return cantidadJugadoresEnPosicion;

    }

}
