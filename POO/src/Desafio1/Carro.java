package Desafio1;

public class Carro extends Transporte {

    //Usando a superclasse para herança
    public Carro(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        super(nome, velocidadeMaxima, autonomia, tipoDeCombustivel);
    }

    //O código vai dizer no nome do carro e mostrar que está se movendo
    @Override
    public void mover() {
        System.out.println("O carro " + getNome() + " está se movendo");
    }

    //O código vai dizer no nome do carro e mostrar que está parado
    @Override
    public void parar() {
        System.out.println("O carro " + getNome() + " parou");
    }
}