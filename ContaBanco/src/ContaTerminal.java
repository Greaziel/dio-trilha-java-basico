import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência: ");
        conta.setAgencia(scanner.nextLine());
        System.out.println("Por favor, digite o número da Conta: ");
        conta.setNumero(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Por favor, digite o seu nome: ");
        conta.setNomeCliente(scanner.nextLine());
        System.out.println("Por favor, digite o seu saldo: ");
        conta.setSaldo(scanner.nextBigDecimal());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco," +
                " sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
                conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
    }
}