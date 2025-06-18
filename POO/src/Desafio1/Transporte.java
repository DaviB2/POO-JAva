package Desafio1;

//Classe do objeto
public abstract class Transporte {
    private String nome;
    private int velocidadeMaxima;
    private int autonomia;
    private String tipoDeCombustivel;

    //Constructor do tal objeto
    Transporte(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.autonomia = autonomia;
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public Transporte() {

    }

    public String getNome() {
        return nome;
    }

    //Alerta para que o nome não seja vazio
    public void setNome(String nome) {
        if (nome == null) {
            System.out.println("Nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    //Alerta para que a velocidade não seja menor que 5
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        if(velocidadeMaxima < 5){
            System.out.println("Velocidade maior que 5km/h");
        }
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getAutonomia() {
        return autonomia;
    }

    //Alerta para que o número não seja menor que 0
    public void setAutonomia(int autonomia) {
        if(autonomia < 0){
            System.out.println("Deve ser maior que 0");
        }
        this.autonomia = autonomia;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    //Alerta para que não haja um nome do combustivel vazio
    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        if (tipoDeCombustivel == null) {
            System.out.println("Tipo de combustível não pode ser vazio");
        }
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    //Método abstrato
    public abstract void mover();
    public abstract void parar();

    //Método não abstrato
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Autonomia: " + autonomia + " km");
        System.out.println("Tipo de Combustível: " + tipoDeCombustivel);
    }
}