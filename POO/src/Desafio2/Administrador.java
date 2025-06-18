package Desafio2;

public class Administrador extends Funcionario {

    //Usando a superclasse para herança
    public Administrador(String nome, int CPF, double salario) {
        super(nome, CPF, salario);
    }

    //Nome do cargo
    @Override
    public void exibirCargo() {
        System.out.println("Cargo: Administrador");
    }

    //Vai ser calculado o salário e adicionado 10%
    @Override
    public void calcularBonus() {
        double bonus = getSalario() * 0.10;
        System.out.println("Bônus: R$ " + bonus);
    }
}