package quest6;

import java.util.Scanner;

public class DadoAnimal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        Animal animal4 = new Animal();

        System.out.println("Digite o nome do animal: ");
        animal.setNome(sc.next());
        System.out.println("Digite a raça: ");
        animal.setRaca(sc.next());
        System.out.println("Digite a idade: ");
        animal.setIdade(sc.nextInt());

        System.out.println("Digite o nome do segundo animal: ");
        animal2.setNome(sc.next());
        System.out.println("Digite a raça: ");
        animal2.setRaca(sc.next());
        System.out.println("Digite a idade: ");
        animal2.setIdade(sc.nextInt());

        System.out.println("Digite o nome do terceiro animal: ");
        animal3.setNome(sc.next());
        System.out.println("Digite a raça: ");
        animal3.setRaca(sc.next());
        System.out.println("Digite a idade: ");
        animal3.setIdade(sc.nextInt());

        System.out.println("Digite o nome do quarto animal: ");
        animal4.setNome(sc.next());
        System.out.println("Digite a raça: ");
        animal4.setRaca(sc.next());
        System.out.println("Digite a idade: ");
        animal4.setIdade(sc.nextInt());

        System.out.println(animal.toString());
        System.out.println(animal2.toString());
        System.out.println(animal3.toString());
        System.out.println(animal4.toString());
    }
}
