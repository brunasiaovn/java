package contandogatos;

public class NumeroGatos {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        // add your code here
        Cat.count++;

        Cat cat2 = new Cat();
        // add your code here
        Cat.count++;

        System.out.println("A contagem de gatos é " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}