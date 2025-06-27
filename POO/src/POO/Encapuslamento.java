//Exemplo de Código:
//Aqui está um exemplo básico de como os métodos get e set são implementados em Java:
public class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;

    // Método Getter para o nome
    public String getNome() {
        return nome;
    }

    // Método Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método Getter para a idade
    public int getIdade() {
        return idade;
    }

    // Método Setter para a idade
    public void setIdade(int idade) {
        if (idade > 0) { // Verificando se a idade é válida
            this.idade = idade;
            } else {
            System.out.println("Idade inválida.");
        }
    }

    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa();

        // Usando os métodos set para definir valores
        pessoa.setNome("João");
        pessoa.setIdade(25);

        // Usando os métodos get para acessar os valores
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}

/*
- **Métodos `get` e `set`:**
    - O método `getNome()` retorna o valor do atributo `nome`.
    - O método `setNome(String nome)` define o valor do atributo `nome`.
    - O método `getIdade()` retorna o valor do atributo `idade`.
    - O método `setIdade(int idade)` define o valor do atributo `idade` 
    e realiza uma verificação para garantir que a idade seja válida (maior que 0).
 */

//Conta Bancaria

public class ContaBancaria {
    private double saldo;
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
}

//Produto

public class Produto {
    private double preco;
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if(preco > 0)
            this.preco = preco;
    }
}

//Carro

public class Carro {
    private String modelo;
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

//Aluno

public class Aluno {
    private int idade;
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if(idade >= 0)
            this.idade = idade;
    }
}

//Retangulo

public class Retangulo {
    private double largura;
    private double altura;
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calcularArea() {
        return largura * altura;
    }
}

//Circulo

public class Circulo {
    private double raio;
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        if(raio > 0)
            this.raio = raio;
    }
}