package semana_1;

import java.util.Scanner;

public class Toolbox {

    public void determinarSiEsNumeroPrimo () {
        Scanner obtenerNumero = new Scanner(System.in);
        int contador, I, numero;
        System.out.print("Ingresa un numero: ");
        numero = obtenerNumero.nextInt();
        contador = 0;
        for (I = 1; I <= numero; I++) {
            if ((numero % I) == 0) {
                contador++;
            }
        }
        if (contador <= 2) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }
    }
