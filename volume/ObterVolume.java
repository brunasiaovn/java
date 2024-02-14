package volume;

public class ObterVolume {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        return 1000L * a * b * c;
    }
}
