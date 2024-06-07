public class Conta {
    int numero;
    String agencia;
    String titular;
    Double saldo;

    public Conta(int numero, String agencia, String titular, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta() {}

    public void printThanksWithConcat() {
        System.out.println("Olá ".concat(titular).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo ").concat(String.valueOf(saldo)).concat(" já está disponível para saque."));
    }

    public void printThanksWithFormat() {
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                titular, agencia, numero, saldo);
        System.out.println();
    }

    public void printThanksWithConcatenation() {
        System.out.println("Olá " + titular + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
