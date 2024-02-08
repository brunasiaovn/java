public class PesoterraLua {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double weightMoon = 0.17 * earthWeight;
        return weightMoon;
    }
}

    

