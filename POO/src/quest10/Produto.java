package quest10;

public class Produto {
    private String nome;
    private String descricao;
    private int quantidadeEstoque;

    Produto(String nome, String descricao, int quantidadeEstoque){
        this.nome = nome;
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public Produto(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Produto3{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }
}
