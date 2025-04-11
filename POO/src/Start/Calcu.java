package Start;

import java.util.Scanner;

public class Calcu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double num1, num2;
        int tipoCalculo;

        System.out.println("Bem vindo ao programa calculadora!");
        System.out.println("Escreva o primeiro valor: ");
        num1 = sc.nextDouble();
        System.out.println("Escreva o segundo valor: ");
        num2 = sc.nextDouble();
        System.out.println("Escreva o tipo de calculo: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("Escolha: ");
        tipoCalculo = sc.nextInt();

        tipoCalculo = opcaoCalculo();

        if (tipoCalculo == 1){
            System.out.println("O resultado é: " + (num1 + num2));
        } else if (tipoCalculo == 2){
            System.out.println("O resultado é: " + (num1 - num2));
        } else if (tipoCalculo == 3) {
            System.out.println("O resultado é: " + (num1 * num2));
        } else if (tipoCalculo == 4){
            System.out.println("O resultado é: " + (num1 / num2));
        }
    }
    public static int opcaoCalculo(){
        System.out.println("Opções de calculo: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("Escolha: ");

        int tipoCalculo = sc.nextInt();
        return tipoCalculo;
    }
}
