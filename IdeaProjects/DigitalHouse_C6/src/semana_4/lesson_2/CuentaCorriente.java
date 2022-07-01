package semana_4.lesson_2;

public class CuentaCorriente extends Cuentas {
    private Double giroDescubierto;

    public CuentaCorriente(Cliente cliente, double saldo, double giroDescubierto) {
        super(cliente, saldo);
        this.giroDescubierto = giroDescubierto;
    }

    public double getGiroDescubierto() {
        return giroDescubierto;
    }

    public void setGiroDescubierto(double giroDescubierto) {
        this.giroDescubierto = giroDescubierto;
    }

    @Override
    public void extraerEfectivo(double monto){
        if (getSaldo() + this.giroDescubierto >= monto){
            setSaldo(getSaldo()-monto);
        }
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + super.toString() +
                "giroDescubierto=" + giroDescubierto +
                '}';
    }
}
