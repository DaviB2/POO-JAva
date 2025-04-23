package quest11;

import java.util.Scanner;

public class DadosEmprestimos {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Emprestimo emprestimo = new Emprestimo();
        Emprestimo emprestimo2 = new Emprestimo();
        Emprestimo emprestimo3 = new Emprestimo();
        Emprestimo emprestimo4 = new Emprestimo();

        System.out.println("Digite o valor do emprestimo: ");
        emprestimo.setValor(sc.nextInt());
        System.out.println("Digite a data do emprestimo: ");
        emprestimo.setDataDeEmprestimo(sc.nextInt());
        System.out.println("Digite o número de parcelas: ");
        emprestimo.setNumeroDeParcelas(sc.nextInt());

        System.out.println("Digite o valor do emprestimo: ");
        emprestimo2.setValor(sc.nextInt());
        System.out.println("Digite a data do emprestimo: ");
        emprestimo2.setDataDeEmprestimo(sc.nextInt());
        System.out.println("Digite o número de parcelas: ");
        emprestimo2.setNumeroDeParcelas(sc.nextInt());

        System.out.println("Digite o valor do emprestimo: ");
        emprestimo3.setValor(sc.nextInt());
        System.out.println("Digite a data do emprestimo: ");
        emprestimo3.setDataDeEmprestimo(sc.nextInt());
        System.out.println("Digite o número de parcelas: ");
        emprestimo3.setNumeroDeParcelas(sc.nextInt());

        System.out.println("Digite o valor do emprestimo: ");
        emprestimo4.setValor(sc.nextInt());
        System.out.println("Digite a data do emprestimo: ");
        emprestimo4.setDataDeEmprestimo(sc.nextInt());
        System.out.println("Digite o número de parcelas: ");
        emprestimo4.setNumeroDeParcelas(sc.nextInt());

        System.out.println(emprestimo.toString());
        System.out.println(emprestimo2.toString());
        System.out.println(emprestimo3.toString());
        System.out.println(emprestimo4.toString());
    }
}
