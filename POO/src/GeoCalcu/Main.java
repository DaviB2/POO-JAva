package GeoCalcu;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opc = 0;
        System.out.println("Bem vindo ao Sistema de Calculador de Formas Geometricas");
        System.out.println("qual forma você deseja usar?");
        System.out.println(
                "Opções: \n" +
                "1. Quadrado\n" +
                "2. Retângulo");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1: {
                System.out.println("Digite a cor do quadrado: ");
                System.out.println("Digite o lado do quadrado: ");
                double lado = sc.nextDouble();

                Quadrado quadrado = new Quadrado(cor, lado);

                System.out.println("Perimetro: " + quadrado.calculaPerimetro());
                System.out.println("Area: " + quadrado.calculaArea());
                System.out.println("Volume: " + quadrado.calculaVolume());

                break;
            }
        }
    }
}
