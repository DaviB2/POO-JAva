package quest10;

import java.util.Scanner;

public class DadoProduto2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Produto produto = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        Produto produto4= new Produto();

        System.out.println("Digite o nome do produto: ");
        produto.setNome(sc.next());
        System.out.println("Digite a descrição: ");
        produto.setDescricao(sc.next());
        System.out.println("Digite a quantidade: ");
        produto.setQuantidadeEstoque(sc.nextInt());

        System.out.println("Digite o nome do segundo produto: ");
        produto2.setNome(sc.next());
        System.out.println("Digite a descrição: ");
        produto2.setDescricao(sc.next());
        System.out.println("Digite a quantidade: ");
        produto2.setQuantidadeEstoque(sc.nextInt());

        System.out.println("Digite o nome do terceiro produto: ");
        produto3.setNome(sc.next());
        System.out.println("Digite a descrição: ");
        produto3.setDescricao(sc.next());
        System.out.println("Digite a quantidade: ");
        produto3.setQuantidadeEstoque(sc.nextInt());

        System.out.println("Digite o nome do quarto produto: ");
        produto4.setNome(sc.next());
        System.out.println("Digite a descrição: ");
        produto4.setDescricao(sc.next());
        System.out.println("Digite a quantidade: ");
        produto4.setQuantidadeEstoque(sc.nextInt());

        System.out.println(produto.toString());
        System.out.println(produto2.toString());
        System.out.println(produto3.toString());
        System.out.println(produto4.toString());
    }
}
