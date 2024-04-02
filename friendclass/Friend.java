package friendclass;

public class Friend {
    public String nome;
    public int age;
    public char sex;

    public void initialize(String nome) {
        this.nome = nome;
    }

    public void initialize(String nome, int age) {
        this.nome = nome;
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