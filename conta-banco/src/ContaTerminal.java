import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da conta:");
        numero = scan.nextInt();
        System.out.println("Digite o número da agência:");
        agencia = scan.next();
        System.out.println("Digite o seu nome:");
        nomeCliente = scan.next();
        System.out.println("Digite o valor do depósito inicial:");
        saldo = scan.nextInt();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %5.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}