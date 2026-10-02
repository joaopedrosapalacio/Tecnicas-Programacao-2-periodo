public class mainPagamento {
    public static void main(String[] args) {
        PagamentoPix pix = new PagamentoPix(200, "chavepix@gmail.com");
        PagamentoCartaoCredito credito = new PagamentoCartaoCredito(3456, 200);

        pix.processarPagamento();
        credito.processarPagamento();
    }    
}
