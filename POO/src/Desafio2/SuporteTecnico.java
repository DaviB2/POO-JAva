package Desafio2;

public class SuporteTecnico extends Funcionario {

    //Usando a superclasse para herança
    public SuporteTecnico(String nome, int CPF, double salario) {
        super(nome, CPF, salario);
    }

    //Nome do cargo
    @Override
    public void exibirCargo() {
        System.out.println("Cargo: Suporte Técnico");
    }

    //Vai ser calculado o salário e adicionado 8%
    @Override
    public void calcularBonus() {
        double bonus = getSalario() * 0.08;
        System.out.println("Bônus: R$ " + bonus);
    }
}