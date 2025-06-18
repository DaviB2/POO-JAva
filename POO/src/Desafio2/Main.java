package Desafio2;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        // Cadastro de um Administrador
        System.out.println("Cadastrar Administrador:");
        funcionarios.add(cadastrarFuncionario("Administrador", scanner));

        // Cadastro de um Desenvolvedor
        System.out.println("\nCadastrar Desenvolvedor:");
        funcionarios.add(cadastrarFuncionario("Desenvolvedor", scanner));

        // Cadastro de um Suporte Técnico
        System.out.println("\nCadastrar Suporte Técnico:");
        funcionarios.add(cadastrarFuncionario("Suporte Técnico", scanner));

        // Exibir informações de todos os funcionários
        for (Funcionario f : funcionarios) {
            System.out.println("\n----- " + f.getNome() + " -----");
            f.exibirCargo();
            f.calcularBonus();
            f.exibirInformacoes();
        }

        scanner.close();
    }

    // Método para cadastrar um funcionário
    private static Funcionario cadastrarFuncionario(String tipo, Scanner scanner) {
        String nome, cpf;
        double salario;

        // Receber nome
        System.out.print("Nome: ");
        nome = scanner.nextLine();

        // Receber CPF
        System.out.print("CPF (11 dígitos): ");
        cpf = scanner.nextLine();

        // Receber Salário
        System.out.print("Salário: R$ ");
        salario = scanner.nextDouble();
        scanner.nextLine();  // Limpar o buffer do scanner

        // Criando o funcionário com base no tipo informado
        Funcionario funcionario = null;
        switch (tipo) {
            case "Administrador":
                funcionario = new Administrador(nome, cpf, salario);
                break;
            case "Desenvolvedor":
                funcionario = new Desenvolvedor(nome, cpf, salario);
                break;
            case "Suporte Técnico":
                funcionario = new SuporteTecnico(nome, cpf, salario);
                break;
        }
        return funcionario;
    }
}