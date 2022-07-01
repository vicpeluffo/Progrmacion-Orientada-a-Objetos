package semana_4.lesson_2;

public class Program {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(12, "perez", 12345, "234.12345566.12");
        CuentaCorriente cu1 = new CuentaCorriente(cliente1, 500, 300);
        CajaAhorro ca1 = new CajaAhorro(cliente1, 400, 0.05);

        System.out.println(ca1.toString());
        System.out.println(cu1.toString());
        cu1.extraerEfectivo(900);
        ca1.cobrarInteres();

        System.out.println(ca1.toString());
        System.out.println(cu1.toString());

    }

}
