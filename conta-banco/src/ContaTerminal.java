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

//        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
//                conta.titular, conta.agencia, conta.numero, conta.saldo);

//        System.out.println("Olá " + conta.titular + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque.");

        System.out.println("Olá ".concat(conta.titular).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(conta.agencia).concat(", conta ").concat(String.valueOf(conta.numero)).concat(" e seu saldo ").concat(String.valueOf(conta.saldo)).concat(" já está disponível para saque."));
        System.out.println();

    }
}