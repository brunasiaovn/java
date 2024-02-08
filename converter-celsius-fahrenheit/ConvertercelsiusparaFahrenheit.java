public class ConvertercelsiusparaFahrenheit {
        public static void main(String[] args) {
            System.out.println(convertCelsiusToFahrenheit(40));
        }
    
        public static double convertCelsiusToFahrenheit(int celsius) {
            double fahrenheit = (9 / 5 * celsius + 32);
            return fahrenheit;
        }
}
