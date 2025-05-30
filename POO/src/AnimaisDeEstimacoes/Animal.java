package AnimaisDeEstimacoes;

public class Animal {
    public String nome;
    public int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            System.out.println("Não pode!");
        }
        this.idade = idade;
    }
    public abstract void emitirSom();
    public abstract void comer();
    public abstract void exibirInformacoes();
}
