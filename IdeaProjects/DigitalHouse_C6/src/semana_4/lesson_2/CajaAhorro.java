package semana_4.lesson_2;

public class CajaAhorro extends Cuentas{
    private double tasaInteres;

    public CajaAhorro(Cliente cliente, double saldo, double tasaInteres) {
        super(cliente, saldo);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void extraerEfectivo(double monto){
        if (getSaldo() >= monto){
            setSaldo(getSaldo()-monto);
        }
    }
    public void cobrarInteres(){
        setSaldo(getSaldo() + (tasaInteres * getSaldo()) );
    }

    @Override
    public String toString() {
        return "CajaAhorro{" +
                "tasaInteres=" + tasaInteres +
                '}';
    }
}
