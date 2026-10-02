public class PagamentoCartaoCredito extends Pagamento{
    
    private int numeroCartao;

    public PagamentoCartaoCredito(int numeroCartao, double valor) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override 
    public void processarPagamento(){
        System.out.println("Pagar no cartao de credito");
    }
}
