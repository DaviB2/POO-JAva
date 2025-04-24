package Ativi4;

import java.util.Scanner;

public class DadosTreinamento {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Treinamento treinamento = new Treinamento();

        //Ele vai repetir 3 vezes
        for(int i = 0; i < 3; i++){
            System.out.println("Digite o nome do aluno: ");
            treinamento.setNome(sc.next());
            System.out.println("Digite a idade: ");
            treinamento.setIdade(sc.nextInt());
            System.out.println("Digite a nota final: ");
            treinamento.setNota(sc.nextDouble());
        }

        //Ele vai avisar se a idade estiver errado
        if(treinamento.getIdade() < 14){
            throw new IllegalArgumentException("Não pode aluno menor que 14 anos!");
        }

        //Ele vai avisar se a nota estiver errado
        if(treinamento.getNota() > 10){
            throw new IllegalArgumentException("Não pode nota maior que 10!");
        }
        if(treinamento.getNota() < 0){
            throw new IllegalArgumentException("Não pode nota menor que 0!");
        }
    }
}