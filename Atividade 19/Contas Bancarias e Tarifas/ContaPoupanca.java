public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override 
    public void descontarTarifa() {
        System.out.println("A conta poupanca esta isenta de tarifas");
    }
    
}
