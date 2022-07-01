package semana_2;

public class CajaDeAhorros {
    private String nombre;
    private double saldo;
    private int CBU;
    private String alias;

    public CajaDeAhorros(String nombre, double saldo, int CBU, String alias) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.CBU = CBU;
        this.alias = alias;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double monto){
        double v = this.saldo - monto;
    }

    public void depositar(double monto){
        double m = this.saldo + monto;
    }

    public void recibirTransferencia(double monto){
        double t = this.saldo + monto;
    }
}

