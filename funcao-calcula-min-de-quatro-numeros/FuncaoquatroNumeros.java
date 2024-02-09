public class FuncaoquatroNumeros {
    public static int min(int a, int b, int c, int d) {
        if (min(a, b) < c) {
            return (min(a, b) <= d) ? min(a, b) : d;
        } else {
            return (c <= d) ? c : d;
        }
    }

    public static int min(int a, int b) {
        return (a <= b) ? a : b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}