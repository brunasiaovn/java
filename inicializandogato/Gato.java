package inicializandoGato;
public class Gato {
    public String nome;
    public int idade;
    public int peso;
    public String endereço;
    public String cor;

    public void initialize(String nome) {
        this.nome = nome;
        this.idade = 1;
        this.peso = 1;
        this.cor = "Preto";
    }

    public void initialize(String nome, int peso, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.cor = "Preto";
    }

    public void initialize(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.peso = 1;
        this.cor = "Preto";
    }

    public void initialize(int peso, String cor) {
        this.peso = peso;
        this.cor = cor;
        this.idade = 1;
    }

    public void initialize(int peso, String cor, String endereço) {
        this.peso = peso;
        this.endereço = endereço;
        this.cor = cor;
        this.idade = 1;
    }

    public static void main(String[] args) {

    }
}
