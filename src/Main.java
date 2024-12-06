import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Criando o objeto conta1 da classe ContaTerminal
        ContaTerminal conta1 = new ContaTerminal();

        // Scanner para ler entradas do usuário via terminal
        Scanner scanner = new Scanner(System.in);

        /**
         * Verifica se foram passados argumentos suficientes pela linha de comando.
         * Caso contrário, solicita os dados do usuário via terminal.
         */
        if (args.length < 4) {
            System.out.println("Argumentos insuficientes. Por favor, insira os dados no terminal.\n");

            // Seção dedicada para solicitar e ler os parâmetros
            System.out.println("Por favor, digite o número da Conta:");
            conta1.numeroConta = Integer.parseInt(scanner.nextLine());

            System.out.println("Por favor, digite o número da Agência (sem '-'):");
            conta1.agenciaConta = scanner.nextLine();

            System.out.println("Por favor, digite seu nome:");
            conta1.nomeCliente = scanner.nextLine();

            System.out.println("Por favor, insira o valor do depósito:");
            conta1.saldoConta = Double.parseDouble(scanner.nextLine());
        } else {
            // Caso todos os argumentos sejam passados, atribui diretamente aos atributos
            conta1.numeroConta = Integer.parseInt(args[0]);
            conta1.agenciaConta = args[1];
            conta1.nomeCliente = args[2];
            conta1.saldoConta = Double.parseDouble(args[3]);
        }

        // Mensagem de confirmação com os dados fornecidos
        System.out.println("\nOlá, " + conta1.nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + conta1.agenciaConta + ", conta " + conta1.numeroConta +
                " e seu saldo R$ " + conta1.saldoConta + " já está disponível para saque.");

        // Fecha o Scanner para liberar recursos (Parece bobo, porém é super relevante
        // criar o hábito de fechar objetos que consomem recursos do sistema, como fluxos de entrada/saída,
        // para evitar vazamentos de memória e garantir uma boa prática de programação).
        scanner.close();
    }
}
