package semana_6.lesson_1;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Equipo lasAguilas = new Equipo ("Aguilas");

        Jugador gonzalez = new Jugador (3,"Paco Gonzalez", false, true);
        lasAguilas.addJugador(gonzalez);
        Jugador mendes = new Jugador(5, "Pedro mendes", false, true);
        lasAguilas.addJugador(mendes);

        ArrayList<Jugador> jugadores = lasAguilas.getJugadores();


        for (int i = 0; i<jugadores.size(); i++){
            System.out.println("nombre del jugador " + (i+1) + ": " + jugadores.get(i).toString());
        }
        lasAguilas.mostrarJugadoresTitulares();

    }





}
