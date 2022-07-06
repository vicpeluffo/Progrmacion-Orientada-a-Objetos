package Practicas.ejercicioArraylist;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Cuenta cuentaDeMartin = new Cuenta(123456, 9000);
        Cuenta cuentaCorrienteM = new Cuenta (67890, 2000);
        Persona MartinP = new Persona("Martin", "Paliza", 33);
        MartinP.addCuenta(cuentaCorrienteM);
        MartinP.addCuenta(cuentaDeMartin);

        MartinP.mostrarCuenta();
    }
}
