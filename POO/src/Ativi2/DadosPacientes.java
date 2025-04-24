package Ativi2;

import java.util.Scanner;

public class DadosPacientes {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Pacientes pacientes = new Pacientes();

        //Ele vai repetir 4 vezes
       for(int i = 0; i < 4; i++){
           System.out.println("Digite seu nome completo: ");
           pacientes.setNome(sc.next());
           System.out.println("Digite seu CPF: ");
           pacientes.setCpf(sc.nextFloat());
           System.out.println("Digite seu email: ");
           pacientes.setEmail(sc.next());
       }

       //Ele vai avisar se o CPF estiver errado
        if(pacientes.getCpf() < 14){
            throw new IllegalArgumentException("Não existe CPF com menos de 14 digitos!");
        }
        if(pacientes.getCpf() > 14){
            throw new IllegalArgumentException("Não existe CPF com maior de 14 digitos!");
        }
    }
}