package semana_4.lesson_2;

public abstract class Cuentas {
    private Cliente cliente;
    private double saldo;

    public Cuentas(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto){
        this.saldo += monto;
    }
    public abstract void extraerEfectivo(double monto);

    public void informarSaldo(){
        System.out.println("El saldo es de: " + getSaldo());

    }

    @Override
    public String toString() {
        return "Cuentas{" +
                "cliente=" + cliente.getApellido() +
                ", saldo=" + saldo +
                '}';
    }
}
