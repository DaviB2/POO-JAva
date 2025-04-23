package quest5;

import java.util.Scanner;

public class DadoProduto {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Produto produto = new Produto();
        Produto produto2 = new Produto();

        System.out.println("Digite o nome do produto: ");
        produto.setNome(sc.next());
        System.out.println("Digite o preço: ");
        produto.setPreco(sc.nextInt());

        System.out.println("Digite o nome do segundo produto: ");
        produto2.setNome(sc.next());
        System.out.println("Digite o preço: ");
        produto2.setPreco(sc.nextInt());

        System.out.println(produto.toString());
        System.out.println(produto2.toString());
    }
}
