package Funcionarios;

public class Funcionario {
    private String nome;
    private Double salarioBase;

    public Funcionario(String nome, Double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public void calcularBonus(){
        System.out.println("" + nome + "Seu salário é " + salarioBase);
    }
}