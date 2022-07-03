package Practicas.ejercicioArraylist;

public class Cuenta implements Comparable {
    private Integer nroCuenta;
    private double saldo;

    public Cuenta(Integer nroCuenta, double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public Integer getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(Integer nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Object o) {
        Cuenta cuenta = (Cuenta) o;
        {
            if (this.nroCuenta == ((Cuenta) o).nroCuenta) {
                return 0;
            } else if (this.nroCuenta > ((Cuenta) o).nroCuenta) {
                return 1;
            } else {
                return 2;
            }

        }
    }
}
