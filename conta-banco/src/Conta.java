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
}
