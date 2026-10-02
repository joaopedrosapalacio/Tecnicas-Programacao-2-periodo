public class mainContaBancaria {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente(2000);
        ContaPoupanca poupanca = new ContaPoupanca(3000);

        corrente.depositar(300);
        poupanca.depositar(400);
        corrente.descontarTarifa();
        poupanca.descontarTarifa();
    }
}
