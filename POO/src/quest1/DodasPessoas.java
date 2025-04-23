package quest1;

import java.util.Scanner;

public class DodasPessoas {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        System.out.println("Escreva o nome da primeira pessoa: ");
        pessoa.setNome(sc.next());
        System.out.println("Digite a idade: ");
        pessoa.setIdade(sc.nextInt());

        System.out.println("Escreva o nome da segunda pessoa: ");
        pessoa2.setNome(sc.next());
        System.out.println("Digite a idade: ");
        pessoa2.setIdade(sc.nextInt());

        System.out.println(pessoa.toString());
        System.out.println(pessoa2.toString());
    }
}
