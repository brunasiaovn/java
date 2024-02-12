public class ConvertereurparaUsd {
    public static void main(String[] args) {
        double i = convertEurToUsd(500, 1.08);
        double ii = convertEurToUsd(300, 1.08);
        System.out.println(i);
        System.out.println(ii);
    }
    public static double convertEurToUsd(int eur, double taxadeCambio){
return eur * taxadeCambio;
    }
}