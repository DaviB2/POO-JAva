package Desafio1;

public class Bicicleta extends Transporte {

    //Usando a superclasse para herança
    public Bicicleta(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        super(nome, velocidadeMaxima, autonomia, tipoDeCombustivel);
    }

    //O código vai dizer no nome da bicicleta e mostrar que está se movendo
    @Override
    public void mover() {
        System.out.println("A bicicleta " + getNome() + " está sendo pedalada");
    }

    //O código vai dizer no nome da bicicleta e mostrar que está parado
    @Override
    public void parar() {
        System.out.println("A bicicleta " + getNome() + " parou");
    }
}
