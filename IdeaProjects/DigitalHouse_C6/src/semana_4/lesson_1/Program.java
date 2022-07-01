package semana_4.lesson_1;

public class Program {
    public static void main(String[] args) {
        Nave nave1 = new Nave(3, 5, 'N', 3, 2);
        Nave nave2 = new Nave(6, 3, 'S', 2, 2);

        nave1.irA(4, 7, 'S');
        nave1.irA(9, 6, 'E');
        System.out.println(nave1.toString());
    }
}
