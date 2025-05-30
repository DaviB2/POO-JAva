package GeoCalcu;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("Bem vindo ao Sistema de Calculador de Formas Geometricas");
            System.out.println("qual forma você deseja usar?");
            System.out.println(
                    "Opções: \n" +
                            "0. Sair\n" +
                            "1. Quadrado\n" +
                            "2. Retângulo\n");
                opcao = sc.nextInt();
            FormaGeometrica forma;

            switch (opcao) {
                case 0:{
                    System.out.println("Obrigado por usar o nosso sistema");
                    break;
                }
                case 1: {
                    System.out.println("Digite a cor do quadrado: ");
                    String cor = sc.next();
                    System.out.println("Digite o lado do quadrado: ");
                    double lado = sc.nextDouble();

                    forma = new Quadrado(cor, lado);

                    int opcao2;
                    do {
                        opcao2 = menuCalculo();

                        if (opcao2 < 0 || opcao2 > 3) {
                            System.out.println("Opção Inválida!");
                        }

                        switch (opcao2) {
                            case 1: {
                                System.out.println("Perimetro: " + forma.calculaPerimetro());
                                break;
                            }
                            case 2: {
                                System.out.println("Area: " + forma.calculaArea());
                                break;
                            }
                            case 3: {
                                System.out.println("Volume: " + forma.calculaVolume());
                                break;
                            }
                        }
                    } while (opcao2 != 0);

                    System.out.println("Perimetro: " + forma.calculaPerimetro());
                    System.out.println("Area: " + forma.calculaArea());
                    System.out.println("Volume: " + forma.calculaVolume());
                    break;
                }
                case 2: {
                    System.out.println("Digite a cor do rentângulo: ");
                    String cor = sc.next();
                    System.out.println("DIgite a largura do retângulo: ");
                    double largura = sc.nextDouble();
                    System.out.println("Digite a altura do retângulo: ");
                    double altura = sc.nextDouble();
                    System.out.println("Digite o comprimento: ");
                    double comprimento = sc.nextDouble();

                    forma = new Retangulo(cor, largura, altura, comprimento);

                    int opcao3;
                    do {
                        opcao3 = menuCalculo();

                        retornoCalculos(opcao3, forma);
                    } while (opcao3 != 0);
                    
                    break;
                }
            }
        }while (opcao != 0);
    }
    static public int menuCalculo(){
        System.out.println("qual calculo deseja fazer?");
        System.out.println(
                "Opções: \n" +
                        "0. Voltar\n" +
                        "1. Perimetro\n" +
                        "2. Area\n" +
                        "3. Volume\n");
        return sc.nextInt();
    }
    static public void retornoCalculos(int opcao3, FormaGeometrica forma){
        if (opcao3 < 0 || opcao3 > 3) {
            System.out.println("Opção Inválida!");
        }

        switch (opcao3) {
            case 1: {
                System.out.println("Largura: " + forma.calculaLargura());
                break;
            }
            case 2: {
                System.out.println("Altura: " + forma.calculaAltura());
                break;
            }
            case 3: {
                System.out.println("Comprimento: " + forma.calculaComprimento());
                break;
            }
        }
    }
}
