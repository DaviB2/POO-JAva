package AutoMacqueen;

import java.util.Scanner;

public class Manu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Veicu veiculo = new Veicu();

        System.out.println("Quantidade de rodas: ");
        veiculo.setQuantidadeRodas(sc.nextInt());
        System.out.println("Chassi: ");
        veiculo.setChassi(sc.next());
        System.out.println("Marca: ");
        veiculo.setMarca(sc.next());
        System.out.println("Tipo: ");
        veiculo.setTipo(sc.nextLine());

        System.out.println(veiculo.toString());
    }
}