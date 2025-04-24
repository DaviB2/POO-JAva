package Ativi3;

import java.util.Scanner;

public class DadosFuncionarios {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();
        Funcionarios funcionarios2 = new Funcionarios();

        //Ele vai pedir as informações
        System.out.println("Digite o nome do funcionário: ");
        funcionarios.setNome(sc.next());
        System.out.println("Digite a matricula: ");
        funcionarios.setMatricula(sc.nextInt());
        System.out.println("Digite o salário: ");
        funcionarios.setSalario(sc.nextDouble());

        //Ele vai avisar se está errado
        if(funcionarios.getMatricula() <= 0){
            throw new IllegalArgumentException("A matricula tem que ser maior que zero!");
        }
        if(funcionarios.getSalario() < 1200){
            throw new IllegalArgumentException("O salário tem que ser maior que R$ 1.200,00");
        }

        //Ele vai pedir as informações do segundo funcionário
        System.out.println("Digite o nome do segundo funcionário: ");
        funcionarios2.setNome(sc.next());
        System.out.println("Digite a matricula: ");
        funcionarios2.setMatricula(sc.nextInt());
        System.out.println("Digite o salário: ");
        funcionarios2.setSalario(sc.nextDouble());

        //Ele vai avisar se estiver errado novamente
        if(funcionarios2.getMatricula() <= 0){
            throw new IllegalArgumentException("A matricula tem que ser maior que zero!");
        }
        if(funcionarios2.getSalario() < 1200){
            throw new IllegalArgumentException("O salário tem que ser maior que R$ 1.200,00");
        }

        //Nesse código ele vai executar todos os dados
        System.out.println(funcionarios.toString());
        System.out.println(funcionarios2.toString());
    }
}
