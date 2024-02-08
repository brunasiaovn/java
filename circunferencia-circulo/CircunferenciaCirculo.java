public class CircunferenciaCirculo {
    /*Exiba a circunferência de um círculo, que é calculada usando a fórmula: C = 2 * pi * raio .
    O resultado é um número fracionário ( double ).
    Use 3,14 como o valor depi. */
    
    public static void main(String[] args) {
        printCircleCircumference(5);
    }

    public static void printCircleCircumference(int radius) {
        double b = 2 * 3.14 * radius;
        System.out.println(b);
    }
}