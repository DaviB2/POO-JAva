package quest5;

public class Produto {
    private String nome;
    private int preco;

    Produto(String nome, int preco){
        this.nome = nome;
        this.preco = preco;
    }
    public Produto(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
