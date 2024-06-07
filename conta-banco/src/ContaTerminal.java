import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Bem-vindo ao terminal de contas!");

        System.out.println("Criando uma conta...");
        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite a agência da conta:");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Digite o nome do titular da conta:");
        String titular = scanner.nextLine();

        System.out.println("Digite o saldo da conta:");
        Double saldo = scanner.nextDouble();

        Conta conta = new Conta(numero, agencia, titular, saldo);

        conta.printThanksWithConcat();
    }
}