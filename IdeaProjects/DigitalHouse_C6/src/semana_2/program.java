package semana_2;

public class program {
    public static void main(String[] args) {
        {UsuarioJuego jugador1 = new UsuarioJuego("Valeria", "1234");

            System.out.println("El puntaje inicial es "+ jugador1.getPuntaje());
            jugador1.aumentarPuntaje();
            System.out.println("El puntaje nuevo es "+ jugador1.getPuntaje());
            jugador1.bonus(4);
            System.out.println("El puntaje por bonus es de: " + jugador1.getPuntaje());

        }
    }
}
