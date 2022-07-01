package semana_6.lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<Jugador>();
    }

    public void addJugador(Jugador jugador){
        this.jugadores.add(jugador);

    }
    public ArrayList getJugadores(){

        return this.jugadores;
    }
    public void setJugador(Jugador jugador){
        //guardar el jugador en la lista de "jugadores"
    }

    public void mostrarJugadoresTitulares(){
        for (int i=0; i<this.jugadores.size(); i++) {
           if (this.jugadores.get(i).isTitular()){
               System.out.println("Es titular: " + jugadores.get(i).isTitular());
           }
        }

    }

    public int getCantidadJugagoresLesionados(){
        return 1;
    }
    public void mostrarJugadoresLesionados(){
        for (int i=0; i<this.jugadores.size(); i++) {
            if (this.jugadores.get(i).isLesionado()){
                System.out.println("Esta lesionado: " + jugadores.get(i).isLesionado());
            }
        }

    }
}
