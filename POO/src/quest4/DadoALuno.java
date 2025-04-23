package quest4;

import java.util.Scanner;

public class DadoALuno {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();

        System.out.println("Digite o nome do primeiro aluno: ");
        aluno1.setNome(sc.next());
        System.out.println("Digite a matricula: ");
        aluno1.setMatricula(sc.next());
        System.out.println("Digite a nota final: ");
        aluno1.setNotaFinal(sc.nextInt());

        System.out.println("Digite o nome do segundo aluno: ");
        aluno2.setNome(sc.next());
        System.out.println("Digite a matricula: ");
        aluno2.setMatricula(sc.next());
        System.out.println("Digite a nota final: ");
        aluno2.setNotaFinal(sc.nextInt());

        System.out.println("Digite o nome do terceiro aluno: ");
        aluno3.setNome(sc.next());
        System.out.println("Digite a matricula: ");
        aluno3.setMatricula(sc.next());
        System.out.println("Digite a nota final: ");
        aluno3.setNotaFinal(sc.nextInt());

        System.out.println("Digite o nome do quarto aluno: ");
        aluno4.setNome(sc.next());
        System.out.println("Digite a matricula: ");
        aluno4.setMatricula(sc.next());
        System.out.println("Digite a nota final: ");
        aluno4.setNotaFinal(sc.nextInt());

        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
        System.out.println(aluno3.toString());
        System.out.println(aluno4.toString());
    }
}
