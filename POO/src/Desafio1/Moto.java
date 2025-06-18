package Desafio1;

public class Moto extends Transporte {

    //Usando a superclasse para herança
    public Moto(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        super(nome, velocidadeMaxima, autonomia, tipoDeCombustivel);
    }

    //O código vai dizer no nome da moto e mostrar que está se movendo
    @Override
    public void mover() {
        System.out.println("A moto " + getNome() + " está acelerando");
    }

    //O código vai dizer no nome da moto e mostrar que está parado
    @Override
    public void parar() {
        System.out.println("A moto " + getNome() + " parou");
    }
}