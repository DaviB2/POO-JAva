//Veiculo
//Superclasse

class Veiculo {
    String marca;
    String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void ligar() {
        System.out.println(marca + " " + modelo + " está ligando.");
    }

    public void desligar() {
        System.out.println(marca + " " + modelo + " está desligando.");
    }
}

//Subclasse

class Carro extends Veiculo {
    int numeroPortas;

    public Carro(String marca, String modelo, int numeroPortas) { //new Carro("Fiat", "Argo", 4
        // 'super()' chama o construtor da superclasse (Veiculo)
        super(marca, modelo);
        this.numeroPortas = numeroPortas;
    }

    // Método específico de Carro
    public void buzinar() {
        System.out.println("O carro buzinou: Bi! Bi!");
    }

    // Opcional: Sobrescrever um método herdado
    @Override // Boa prática para indicar sobrescrita
    public void ligar() {
        System.out.println("O carro " + marca + " " + modelo + " está dando a partida.");
    }
}

//Main

public class TesteHeranca {
    public static void main(String[] args) {
        System.out.println("--- Testando um Veículo ---");
        Veiculo meuVeiculo = new Veiculo("Yamaha", "MT-07");
        meuVeiculo.ligar();
        meuVeiculo.desligar();
        System.out.println();

        System.out.println("--- Testando um Carro ---");
        Carro meuCarro = new Carro("Fiat", "Argo", 4);
        meuCarro.ligar();   // Método sobrescrito em Carro
        meuCarro.buzinar(); // Método específico de Carro
        meuCarro.desligar(); // Método herdado de Veiculo
        System.out.println("Número de portas: " + meuCarro.numeroPortas);
    }
}

/*
- **`super()`**: Usado para chamar o construtor da superclasse dentro do construtor da subclasse.
- **`@Override`**: Anotação que indica que um método da superclasse está sendo sobrescrito na subclasse. 
    Ajuda a evitar erros e melhora a legibilidade.
- **Herança Única**: Em Java, uma classe só pode herdar diretamente de *uma* única superclasse. Não existe herança múltipla de classes.
 */

//Conta

class Conta {
    double saldo;
    void depositar(double valor) {
        saldo += valor;
    }
}

class ContaCorrente extends Conta {
    void cobrarTarifaMensal() {
        saldo -= 10;
    }
}