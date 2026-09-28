public class Caixa {

    private double saldoAtual;
    private boolean status;

    public Caixa(double saldoAtual) {
        this.saldoAtual = saldoAtual;
        this.status = false;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double registrarVenda(double pagamento, double total, double troco) {
        if (pagamento > total) {
            troco = pagamento - total;
            System.out.println("Seu troco sera de " + troco);
            System.out.println("Troco entregue, obrigado pela preferencia");
            saldoAtual += total;
            return troco;
        }

        if (total == pagamento) {
            System.out.println("Compra concluida, obrigado pela preferencia");
            saldoAtual += total;
            return 0;
        }

        double insuficiente = total - pagamento;
        System.out.println("Valor insuficiente, ainda faltam " + insuficiente + " reais");
        System.out.println("Insira o valor correto");
        return insuficiente;
    }
}