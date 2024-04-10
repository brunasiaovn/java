public class Pessoa {
    String nome;
    char sexo;
    int dinheiro;
    int peso;
    double altura;

    public void inicializar(String nome) {
        this.nome = nome;
    }

    public void inicializar(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public void inicializar(String nome, int dinheiro, char sexo) {
        this.nome = nome;
        this.dinheiro = dinheiro;
        this.sexo = sexo;
    }

    public static void main(String[] args) {

    }
}

