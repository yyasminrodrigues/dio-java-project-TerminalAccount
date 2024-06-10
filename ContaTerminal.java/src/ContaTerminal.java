import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e captura o número da conta
        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        // Consumir a nova linha pendente após a leitura de um número
        scanner.nextLine();

        // Solicita e captura o número da agência
        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        // Solicita e captura o nome do cliente
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicita e captura o saldo
        double saldo = 0;
        boolean entradaValida = false;
        
        while (!entradaValida) {
            System.out.print("Por favor, digite o saldo inicial: ");
            if (scanner.hasNextDouble()) {
                saldo = scanner.nextDouble();
                entradaValida = true;
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número válido.");
                scanner.next(); // Limpar a entrada inválida
            }
        }

        // Exibe a mensagem de boas-vindas
        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fecha o scanner
        scanner.close();
    }
}
