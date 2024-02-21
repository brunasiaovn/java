package estacaoano;

public class InvernoPrimavera {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int mês) {
        switch (mês) {
            case 1:
            case 2:
            case 12:
                System.out.println("Inverno");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Primavera");
            case 6:
            case 7:
            case 8:
                System.out.println("Verão");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Outono");
                break;
            default:
                break;
        }
    }
}
