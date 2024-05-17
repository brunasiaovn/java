package friendclass;

public class Friend {
    public String name;
    public int age;
    public char sex;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String nome, int age) {
        this.name = nome;
        this.age = age;
    }

    public void initialize(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }

}