public class Friend {
    public String nome;
    public int idade;
    public char sexo;

    public Friend(String nome) {
        this.nome = nome;
    }

    public Friend(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Friend(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
}