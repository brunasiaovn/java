package nomedoconjunto;

public class Cat {
    @SuppressWarnings("unused")
    private String name = "gato sem nome";

    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Simba");
        System.out.println();
    }
}
