package quest9;

public class Funcionario {
    private String nome;
    private int salario;
    private String cargo;

    Funcionario(String nome, int salario, String cargo){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }
    public Funcionario(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
