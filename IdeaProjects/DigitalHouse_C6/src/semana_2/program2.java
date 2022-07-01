package semana_2;

public class program2 {
    public static void main(String[] args) {
        CajaDeAhorros cajaDeAhorros1 = new CajaDeAhorros("Jose Perez", 2319.50, 1234567890, "arbol.poema");
        CajaDeAhorros cajaDeAhorros2 = new CajaDeAhorros("Maria Gonzalez", 8732.20, 987654321, "ave.salud");
        CajaDeAhorros cajaDeAhorros3 = new CajaDeAhorros("Laura Garcia", 2234.20, 543210987, "pulpo.pala");

        cajaDeAhorros1.retirar(500.0);
        System.out.println("El saldo actual es: " + cajaDeAhorros1.getSaldo());
    }
}
