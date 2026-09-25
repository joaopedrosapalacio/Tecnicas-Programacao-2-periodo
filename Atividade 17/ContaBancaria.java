public class ContaBancaria {

    protected int numeroConta;
    protected double saldo;

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar() {
        System.out.println("Depositando...");
    }

    public void sacar() {
        System.out.println("Sacando...");
    }
}