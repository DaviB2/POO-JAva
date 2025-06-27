//Animal
//Superclasse

class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void fazerSom() {
        System.out.println(nome + " faz um som genérico.");
    }
}

//Subclasse

class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override // Indica que estamos sobrescrevendo o método da superclasse
    public void fazerSom() {
        System.out.println(nome + " late: Au Au!");
    }

    public void abanarRabo() { // Método específico de Cachorro
        System.out.println(nome + " está abanando o rabo.");
    }
}

class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override // Indica que estamos sobrescrevendo o método da superclasse
    public void fazerSom() {
        System.out.println(nome + " mia: Miau!");
    }

    public void arranharMoveis() { // Método específico de Gato
        System.out.println(nome + " está arranhando os móveis.");
    }
}

//Main

public class TestePolimorfismoSimples {
    public static void main(String[] args) {
        // Declaramos uma referência do tipo 'Animal' (superclasse)
        Animal meuBichinho;

        // 1. 'meuBichinho' agora aponta para um objeto Cachorro
        meuBichinho = new Cachorro("Totó");
        System.out.println("--- Primeiro Animal ---");
        meuBichinho.fazerSom(); // Saída: Totó late: Au Au!
                                // O Java sabe que, embora a referência seja Animal,
                                // o objeto real é um Cachorro, e chama o latido.

        System.out.println(); // Apenas para pular uma linha

        // 2. 'meuBichinho' agora aponta para um objeto Gato
        meuBichinho = new Gato("Mimosa");
        System.out.println("--- Segundo Animal ---");
        meuBichinho.fazerSom(); // Saída: Mimosa mia: Miau!
                                // Novamente, o Java executa o método do Gato.

        System.out.println(); // Apenas para pular uma linha

        // 3. 'meuBichinho' agora aponta para um objeto Animal genérico
        meuBichinho = new Animal("Coelho");
        System.out.println("--- Terceiro Animal ---");
        meuBichinho.fazerSom(); // Saída: Coelho faz um som genérico.
                                // Executa o método da própria classe Animal.

        // Importante: Você só pode chamar métodos que existem na classe da referência (Animal)
        // Por exemplo, você NÃO pode fazer:
        // meuBichinho.abanarRabo(); // Se houvesse um método 'abanarRabo' só em Cachorro, daria erro de compilação.
                                   // A referência 'Animal' não "vê" esse método.
    }
}

/*
1. **Flexibilidade e Extensibilidade:** Seu código se torna mais flexível. Você pode adicionar novas subclasses (ex: `Pato`, `Vaca`) 
    sem precisar modificar o código que manipula a superclasse `Animal`. A lista de `Animal`s continuaria funcionando perfeitamente!
2. **Reuso de Código Melhorado:** Permite escrever código mais genérico que opera sobre a superclasse, mas se comporta de forma 
    específica para cada subclasse. Isso evita a necessidade de `if-else` encadeados para cada tipo de objeto.
3. **Manutenibilidade:** Facilita a manutenção, pois a lógica específica de cada tipo de objeto fica encapsulada 
    na sua própria subclasse, e o código genérico opera sobre o tipo base.
4. **Organização:** Ajuda a organizar o código de forma hierárquica e lógica, representando o mundo real onde 
    diferentes entidades compartilham características comuns, mas têm comportamentos únicos.
*/

//Sobrecarga

class Calculadora {
    int somar(int a, int b) {
        return a + b;
    }

    double somar(double a, double b) {
        return a + b;
    }
}