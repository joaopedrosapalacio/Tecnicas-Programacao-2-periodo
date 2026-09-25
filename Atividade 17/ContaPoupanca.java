public class ContaPoupanca extends ContaBancaria {

    private double taxaRendimento;

    public ContaPoupanca(double taxaRendimento, int numeroConta, double saldo) {
        super(numeroConta, saldo);
        this.taxaRendimento = taxaRendimento;
    }
    
    public double aplicarRendimento() {
        return saldo + taxaRendimento;
    }
}