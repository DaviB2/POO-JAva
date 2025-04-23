package quest3;

import java.util.Scanner;

public class DadoLivro {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Livro livro = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();

        System.out.println("Digite o titulo do livro: ");
        livro.setTitulo(sc.next());
        System.out.println("Digite o nome do autor: ");
        livro.setAutor(sc.next());
        System.out.println("Digite a data da publicação: ");
        livro.setAnoDePublicacao(sc.nextInt());

        System.out.println("Digite o titulo do segundo livro: ");
        livro2.setTitulo(sc.next());
        System.out.println("Digite o nome do autor: ");
        livro2.setAutor(sc.next());
        System.out.println("Digite a data da publicação: ");
        livro2.setAnoDePublicacao(sc.nextInt());

        System.out.println("Digite o titulo do segundo livro: ");
        livro3.setTitulo(sc.next());
        System.out.println("Digite o nome do autor: ");
        livro3.setAutor(sc.next());
        System.out.println("Digite a data da publicação: ");
        livro3.setAnoDePublicacao(sc.nextInt());

        System.out.println(livro.toString());
        System.out.println(livro2.toString());
        System.out.println(livro3.toString());
    }
}
