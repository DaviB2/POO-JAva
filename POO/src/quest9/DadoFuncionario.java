package quest9;

import java.util.Scanner;

public class DadoFuncionario {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();
        Funcionario funcionario4 = new Funcionario();

        System.out.println("Digite o nome do funcionario: ");
        funcionario.setNome(sc.next());
        System.out.println("Digite o seu salário: ");
        funcionario.setSalario(sc.nextInt());
        System.out.println("Digite o cargo: ");
        funcionario.setCargo(sc.next());

        System.out.println("Digite o nome do segundo funcionario: ");
        funcionario2.setNome(sc.next());
        System.out.println("Digite o seu salário: ");
        funcionario2.setSalario(sc.nextInt());
        System.out.println("Digite o cargo: ");
        funcionario2.setCargo(sc.next());

        System.out.println("Digite o nome do terceiro funcionario: ");
        funcionario3.setNome(sc.next());
        System.out.println("Digite o seu salário: ");
        funcionario3.setSalario(sc.nextInt());
        System.out.println("Digite o cargo: ");
        funcionario3.setCargo(sc.next());

        System.out.println("Digite o nome do quarto funcionario: ");
        funcionario3.setNome(sc.next());
        System.out.println("Digite o seu salário: ");
        funcionario3.setSalario(sc.nextInt());
        System.out.println("Digite o cargo: ");
        funcionario3.setCargo(sc.next());

        System.out.println(funcionario.toString());
        System.out.println(funcionario2.toString());
        System.out.println(funcionario3.toString());
        System.out.println(funcionario4.toString());
    }
}
