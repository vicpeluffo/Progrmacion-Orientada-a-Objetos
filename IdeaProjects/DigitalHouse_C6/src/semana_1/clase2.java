package semana_1;

import java.util.Scanner;

public class clase2 {
    public static void main(String[] args) {
        System.out.println("CALCULADORA DH PARA SUMAR 2 NUMEROS");
        Scanner scannerCalculadora = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero: ");
        int num1 = scannerCalculadora.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        int num2 = scannerCalculadora.nextInt();
//        int resultado = num1 + num2;
        System.out.println("El resultado es: " + (num1+num2));

    }
}
