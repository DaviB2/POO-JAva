package Ativi1;

import java.util.Scanner;

public class DadosEstoques {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Estoque estoque2 = new Estoque();

        //Ele vai pedir as informações do primeiro produto
        System.out.println("Digite o nome do produto: ");
        estoque.setNome(sc.next());
        System.out.println("Digite o preço do produto: ");
        estoque.setPreco(sc.nextInt());
        System.out.println("Digite a quantidade do estoque: ");
        estoque.setQuantidade(sc.nextInt());

        //Ele vai avisar se está errado
        if(estoque.getPreco() <= 0){
            throw new IllegalArgumentException("O preço não pode ser menor ou igual a zero!");
        }
        if(estoque.getQuantidade() < 0){
            throw new IllegalArgumentException("A quantidade não pode ser negativa!");
        }

        //Ele vai pedir as informações do segundo produto
        System.out.println("Digite o nome do produto: ");
        estoque2.setNome(sc.next());
        System.out.println("Digite o preço do produto: ");
        estoque2.setPreco(sc.nextInt());
        System.out.println("Digite a quantidade do estoque: ");
        estoque2.setQuantidade(sc.nextInt());

        //Ele vai avisar se estiver errado novamente
        if(estoque2.getPreco() <= 0){
            throw new IllegalArgumentException("O preço não pode ser menor ou igual a zero!");
        }
        if(estoque2.getQuantidade() < 0){
            throw new IllegalArgumentException("A quantidade não pode ser negativa!");
        }

        //Ele vai executar todos os dados
        System.out.println(estoque.toString());
        System.out.println(estoque2.toString());
    }
}
