package calculeocusto;

public class CustototaldasMacas {
    public static void main(String[] args) {
        Apple.addPrice(50);
        Apple.addPrice(100);
        System.out.println("The cost of apples is" + Apple.applePrice);
    }

    public static class Apple {
        public static int applePrice = 0;

        public static void addPrice(int applePrice) {
            Apple.applePrice = Apple.applePrice + applePrice;
        }
    }
}