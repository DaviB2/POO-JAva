package quest2;

import java.util.Scanner;

public class DadosCarro {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        System.out.println("Digite o nome da marca: ");
        carro.setMarca(sc.next());
        System.out.println("Digite o nome do modelo: ");
        carro.setModelo(sc.next());
        System.out.println("Digite a data do carro: ");
        carro.setAno(sc.nextInt());

        System.out.println("Digite o nome da marca: ");
        carro2.setMarca(sc.next());
        System.out.println("Digite o nome do modelo: ");
        carro2.setModelo(sc.next());
        System.out.println("Digite a data do carro: ");
        carro2.setAno(sc.nextInt());

        System.out.println("Digite o nome da marca: ");
        carro3.setMarca(sc.next());
        System.out.println("Digite o nome do modelo: ");
        carro3.setModelo(sc.next());
        System.out.println("Digite a data do carro: ");
        carro3.setAno(sc.nextInt());

        System.out.println(carro.toString());
        System.out.println(carro2.toString());
        System.out.println(carro3.toString());
    }
}
