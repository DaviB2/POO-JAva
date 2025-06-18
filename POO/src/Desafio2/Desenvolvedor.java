package Desafio2;

public class Desenvolvedor extends Funcionario {

    //Usando a superclasse para herança
    public Desenvolvedor(String nome, int CPF, double salario) {
        super(nome, CPF, salario);
    }

    //Nome do cargo
    @Override
    public void exibirCargo() {
        System.out.println("Cargo: Desenvolvedor");
    }

    //Vai ser calculado o salário e adicionado 15%
    @Override
    public void calcularBonus() {
        double bonus = getSalario() * 0.15;
        System.out.println("Bônus: R$ " + bonus);
    }
}