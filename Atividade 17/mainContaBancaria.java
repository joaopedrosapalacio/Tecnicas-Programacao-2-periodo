public class mainContaBancaria {
    public static void main(String[] args) {
        
        ContaPoupanca contaPoupanca = new ContaPoupanca(200, 1234, 9000);

        contaPoupanca.aplicarRendimento();
        contaPoupanca.depositar();
        contaPoupanca.sacar();
    }
}