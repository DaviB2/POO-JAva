package quest7;

import java.util.Scanner;

public class DadoEndereco {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Endereco endereco2 = new Endereco();
        Endereco endereco3 = new Endereco();
        Endereco endereco4 = new Endereco();

        System.out.println("Digite o nome da rua: ");
        endereco.setRua(sc.next());
        System.out.println("Digite o numero: ");
        endereco.setNumero(sc.nextInt());
        System.out.println("Digite o nome da cidade: ");
        endereco.setCidade(sc.next());

        System.out.println("Digite o nome da segunda rua: ");
        endereco2.setRua(sc.next());
        System.out.println("Digite o numero: ");
        endereco2.setNumero(sc.nextInt());
        System.out.println("Digite o nome da cidade: ");
        endereco2.setCidade(sc.next());

        System.out.println("Digite o nome da terceira rua: ");
        endereco3.setRua(sc.next());
        System.out.println("Digite o numero: ");
        endereco3.setNumero(sc.nextInt());
        System.out.println("Digite o nome da cidade: ");
        endereco3.setCidade(sc.next());

        System.out.println("Digite o nome da quarta rua: ");
        endereco4.setRua(sc.next());
        System.out.println("Digite o numero: ");
        endereco4.setNumero(sc.nextInt());
        System.out.println("Digite o nome da cidade: ");
        endereco4.setCidade(sc.next());

        System.out.println(endereco.toString());
        System.out.println(endereco2.toString());
        System.out.println(endereco3.toString());
        System.out.println(endereco4.toString());
    }
}
