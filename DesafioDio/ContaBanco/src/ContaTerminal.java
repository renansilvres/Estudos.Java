import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao nosso banco. Para criar uma conta,  digite o número da sua agência: ");
        String agencia = "Agência " + scanner.nextLine();

        System.out.println("Agora digite um número para sua conta: ");
        String numeroDaConta = " conta " + scanner.nextLine();

        System.out.println("Seu nome e sobrenome: ");
        String nomeDoCliente = scanner.nextLine();

        Double saldo = 50.00;

        System.out.println("Olá " + nomeDoCliente + ", sua conta foi criada com os seguintes dados: " + agencia + numeroDaConta
        + " e o saldo disponível para saque é de: R$" + saldo);
    }
}
