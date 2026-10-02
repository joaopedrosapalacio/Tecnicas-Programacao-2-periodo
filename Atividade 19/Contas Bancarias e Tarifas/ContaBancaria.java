public abstract class ContaBancaria {
    
    protected double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void descontarTarifa();
    
    public double depositar(double valor) {
        System.out.print("Voce depositou " + valor + " reais");
        System.out.print("Seu saldo atual e ");
        return valor + saldo;
    }
}
