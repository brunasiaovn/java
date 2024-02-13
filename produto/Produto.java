package produto;

public class Produto {
    public static void main(String[] args) {
        int p = 1;
        for (int i = 2; i <= 10; i++){
            p *= i;
        }
        System.out.println(p);
    }
}
