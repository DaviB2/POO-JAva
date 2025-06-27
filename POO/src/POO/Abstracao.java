//Forma

// Superclasse Abstrata
abstract class Forma {
    String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    // Método abstrato: sem implementação, deve ser implementado pelas subclasses
    public abstract double calcularArea();

    // Método concreto: tem implementação e pode ser herdado diretamente
    public void desenhar() {
        System.out.println("Desenhando uma forma de cor " + cor + ".");
    }
}

//Subclasse circulo

// Subclasse Concreta
class Circulo extends Forma {
    double raio;

    public Circulo(String cor, doubl
    e raio) {
        super(cor);
        this.raio = raio;
    }

    @Override // OBRIGATÓRIO implementar o método abstrato
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

//Subclasse retangulo

// Subclasse Concreta
class Retangulo extends Forma {
    double largura;
    double altura;

    public Retangulo(String cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override // OBRIGATÓRIO implementar o método abstrato
    public double calcularArea() {
        return largura * altura;
    }
}

//Main

public class TesteAbstracao {
    public static void main(String[] args) {
        // Você NÃO pode criar um objeto de uma classe abstrata diretamente:
        // Forma f = new Forma("azul"); // Isso resultaria em um erro de compilação!

        // Mas pode usar referências polimórficas:
        Forma meuCirculo = new Circulo("vermelho", 5.0);
        Forma meuRetangulo = new Retangulo("verde", 4.0, 6.0);

        System.out.println("--- Trabalhando com Formas Abstratas ---");

        System.out.println("Área do Círculo: " + meuCirculo.calcularArea());
        meuCirculo.desenhar(); // Chama o método concreto herdado
        System.out.println();

        System.out.println("Área do Retângulo: " + meuRetangulo.calcularArea());
        meuRetangulo.desenhar(); // Chama o método concreto herdado
    }
}

/*
- A classe `Forma` define um contrato (`calcularArea()`) que suas subclasses devem seguir, 
    mas não se preocupa com os detalhes da implementação.
- Os detalhes de como `calcularArea()` funciona são escondidos dentro de `Circulo` e `Retangulo`.
- Podemos usar referências do tipo `Forma` para manipular objetos `Circulo` e `Retangulo` de forma genérica, 
    o que é um benefício adicional da abstração combinado com polimorfismo.
*/

// Interface
interface Conectavel {
    void conectar();
    void desconectar();
    boolean estaConectado();
}

class MouseUSB implements Conectavel {
    boolean pluggedIn;

    public MouseUSB() {
        this.pluggedIn = false;
    }

    @Override
    public void conectar() {
        System.out.println("Mouse USB conectado.");
        this.pluggedIn = true;
    }

    @Override
    public void desconectar() {
        System.out.println("Mouse USB desconectado.");
        this.pluggedIn = false;
    }

    @Override
    public boolean estaConectado() {
        return pluggedIn;
    }
}

class ImpressoraWifi implements Conectavel {
    boolean conectadaRede;

    public ImpressoraWifi() {
        this.conectadaRede = false;
    }

    @Override
    public void conectar() {
        System.out.println("Impressora Wi-Fi conectada à rede.");
        this.conectadaRede = true;
    }

    @Override
    public void desconectar() {
        System.out.println("Impressora Wi-Fi desconectada da rede.");
        this.conectadaRede = false;
    }

    @Override
    public boolean estaConectado() {
        return conectadaRede;
    }
}

//Main Conectavel

public class TesteConexoes {
    public static void main(String[] args) {
        // Usamos a interface como tipo de referência (polimorfismo!)
        Conectavel meuMouse = new MouseUSB();
        Conectavel minhaImpressora = new ImpressoraWifi();

        System.out.println("--- Gerenciando Conexões ---");

        meuMouse.conectar();
        System.out.println("Mouse está conectado? " + meuMouse.estaConectado());
        meuMouse.desconectar();
        System.out.println("Mouse está conectado? " + meuMouse.estaConectado());
        System.out.println();

        minhaImpressora.conectar();
        System.out.println("Impressora está conectada? " + minhaImpressora.estaConectado());
        minhaImpressora.desconectar();
        System.out.println("Impressora está conectada? " + minhaImpressora.estaConectado());
    }
}

/*
- A interface `Conectavel` define um comportamento comum (`conectar`, `desconectar`, `estaConectado`) 
    para diferentes tipos de dispositivos, sem se preocupar com os detalhes de como cada um se conecta.
- As classes que implementam a interface são obrigadas a fornecer a implementação para esses métodos.
- Podemos tratar `MouseUSB` e `ImpressoraWifi` de forma unificada através da referência `Conectavel`, 
    ocultando os detalhes de implementação de cada dispositivo.
*/

//Interface calculadora

interface Calculadora {
    int somar(int a, int b);
}

class CalculadoraSimples implements Calculadora {
    @Override
    public int somar(int a, int b) {
        return a + b;
    }
}