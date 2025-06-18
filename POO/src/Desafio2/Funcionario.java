package Desafio2;

//Fazemos a classe do objeto
public abstract class Funcionario {
    private String nome;
    private int CPF;
    private double salario;

    //Constructor do objeto
    Funcionario(String nome, int CPF, double salario){
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
    }

    //Aviso de nome vazio
    public String getNome() {
        if (nome == null) {
            System.out.println("Nome não pode ser vazio");
        }
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    //Aviso de que não pode número de 11 digitos
    public void setCPF(int CPF) {
        if(CPF < 11){
            System.out.println("Não pode menor que 11 digitos");
        }
        this.CPF = CPF;
    }

    public double getSalario() {
        return salario;
    }

    //Aviso de que não pode número menor que 0
    public void setSalario(double salario) {
        if(salario < 0){
            System.out.println("Salário tem que ser maior que 0");
        }
        this.salario = salario;
    }

    //Método abstract
    public abstract void exibirCargo();
    public abstract void calcularBonus();

    //Método não abstract
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Salário: " + salario);
    }
}