package quest8;

import java.util.Scanner;

public class DadoContaBancaria {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        ContaBancaria contaBancaria2 = new ContaBancaria();

        System.out.println("Digite o número da conta: ");
        contaBancaria.setNumeroDaConta(sc.nextInt());
        System.out.println("Digite o saldo: ");
        contaBancaria.setSaldo(sc.nextInt());

        System.out.println("Digite o número da segunda conta: ");
        contaBancaria2.setNumeroDaConta(sc.nextInt());
        System.out.println("Digite o saldo: ");
        contaBancaria2.setSaldo(sc.nextInt());

        System.out.println(contaBancaria.toString());
        System.out.println(contaBancaria2.toString());
    }
}
