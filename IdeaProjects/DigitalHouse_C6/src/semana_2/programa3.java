package semana_2;

public class programa3 {
    public static void main(String[] args) {
        Perros perro1 = new Perros (true, "beagle", 2017, 4.5, true, false, "Paco");
        Perros perro2 = new Perros(false, "labrador", 2018, 8.0, true, false, "Ideafix");
        Perros perro3 = new Perros(false, "chihuahua", 2019, 2.3, false, true, "Goliath");

        System.out.println("La edad es: " + perro1.calcularEdad(perro1.getAñoNacimiento()));
        System.out.println("La edad es: " + perro2.calcularEdad(perro2.getAñoNacimiento()));
        System.out.println("La edad es: " + perro3.calcularEdad(perro3.getAñoNacimiento()));

        perro1.verificarPerderse();
        perro1.verificarAdopcion();
        perro2.verificarPerderse();
        perro2.verificarAdopcion();
        perro3.verificarPerderse();
        perro3.verificarAdopcion();
    }
}
