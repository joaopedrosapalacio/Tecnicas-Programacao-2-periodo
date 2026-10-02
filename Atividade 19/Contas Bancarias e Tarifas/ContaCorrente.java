public class ContaCorrente extends ContaBancaria {
    
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override 
    public void descontarTarifa() {
        System.out.println("Descontamos uma tarifa de 20 reais no seu saldo");
        System.out.println("Seu saldo atual e: " + saldoAtual);
        saldoAtual = saldo - 20;
    }
}
