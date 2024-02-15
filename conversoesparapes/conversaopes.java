package conversoesparapes;

public class conversaopes {

    public static void main(String[] args) {
        System.out.println(getFeetFromInches(243));
    }

    public static int getFeetFromInches(int polegadas) {
        int pes = polegadas / 12;
        return pes;
    }

}