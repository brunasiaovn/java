package conversaodetempo;

public class ConversaoTempo {

    public static void main(String[] args) {
        System.out.println(converterparaSegundos(10));
        System.out.println(converterparaSegundos(7));
    }
    public static int converterparaSegundos(int hora) {
        return hora * 60 * 60;
    }
}