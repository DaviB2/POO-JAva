package Desafio1;

public class Onibus extends Transporte {

    //Usando a superclasse para herança
    public Onibus(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        super(nome, velocidadeMaxima, autonomia, tipoDeCombustivel);
    }


    //O código vai dizer no nome do ônibus e mostrar que está se movendo
    @Override
    public void mover() {
        System.out.println("O ônibus " + getNome() + " está em movimento");
    }

    //O código vai dizer no nome do ônibus e mostrar que está parado
    @Override
    public void parar() {
        System.out.println("O ônibus " + getNome() + " parou");
    }
}
