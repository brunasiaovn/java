package maiormenorigual;

public class Numero {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        if (a < 5) {
            System.out.println("O número é menor que 5");
        } else if (a > 5) {
            System.out.println("O número é maior que 5");
        } else {
            System.out.println("O número é igual para 5");
        }
    }
}