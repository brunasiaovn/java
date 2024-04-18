package classe;

/* 
The whole duck isn't enough

*/

public class CatandDog {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        //write your code here
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    //write your code here
}
