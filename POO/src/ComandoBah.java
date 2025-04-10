import java.util.Scanner;

public class ComandoBah {
    //static == const
    static Scanner sc = new Scanner(System.in); //prompt
    public static void main(String[] args) {
        //Variaveis de tipos primitivos
        boolean TrueOrFalse = true;
        int numerosReais = 0; // 10000000000 a -10000000000000 (bytes)
        double decimais = 0.2; // 10000.200 a -10000.400
        char letra = 'A';

        // Variavel tipo objeto
        String texto = "Texto";
        Integer numerosReais2 = 2; // Inteiro do tipo objeto
        Double decimais2 = 0.2; //Decimal do tipo objeto

        String nome = null; // Nulo == ""
        String sexo = "";

        System.out.println("Qual o seu nome?"); // Escreva no terminal - para o usuario
        nome = sc.nextLine(); //Leia - Escreva na variavel nome

        System.out.println("O seu nome é " + nome);
    }
}
