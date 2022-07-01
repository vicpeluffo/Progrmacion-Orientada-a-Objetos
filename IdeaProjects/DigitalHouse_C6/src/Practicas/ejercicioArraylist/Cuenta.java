package Practicas.ejercicioArraylist;

public class Cuenta implements Comparable {
    private Integer nroCuenta;
    private double saldo;

    public Cuenta(Integer nroCuenta, double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
