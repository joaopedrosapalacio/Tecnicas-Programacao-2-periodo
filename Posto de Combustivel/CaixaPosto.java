public class CaixaPosto {

    public void realizarAbastecimentoPorLitro(BombaCombustivel bomba, double litrosDesejados, double dinheiroCliente) {
        if (litrosDesejados > bomba.getEstoqueAtualLitros()) {
            System.out.println("Erro: Combustivel insuficiente no tanque");
            return;
        }

        double valorTotal = litrosDesejados * bomba.getPrecoPorLitro();

        if (dinheiroCliente < valorTotal) {
            System.out.println("Dinheiro insuficiente");
            return;
        }

        bomba.setEstoqueAtualLitros(bomba.getEstoqueAtualLitros() - litrosDesejados);

        double valorImposto = calcularImposto(bomba.getTipoCombustivel(), valorTotal);
        double troco = dinheiroCliente - valorTotal;
        
        emitirCupomFiscal(
            bomba.getTipoCombustivel(), 
            bomba.getPrecoPorLitro(), 
            litrosDesejados, 
            valorTotal, 
            troco, 
            valorImposto, 
            dinheiroCliente, 
            bomba.getEstoqueAtualLitros()
        );
    }

    private double calcularImposto(String tipo, double valorTotal) {
        double aliquota = 0.0;
        switch (tipo) {
            case "Diesel" -> aliquota = 0.12;
            case "Etanol" -> aliquota = 0.18;
            case "Gasolina Comum" -> aliquota = 0.27;
            case "Gasolina Aditivada" -> aliquota = 0.29;
            default -> {
            }
        }

        return valorTotal * aliquota;
    }

    private void emitirCupomFiscal(String tipoCombustivel, double precoPorLitro, double litros, double valorTotal, double troco, double valorImposto, double clienteDinheiro, double estoqueAtualLitros) {
        System.out.println("================================================");
        System.out.println("     CUPOM FISCAL - POSTO DE COMBUSTiVEL");
        System.out.println("================================================");
        System.out.println("Combustivel: " + tipoCombustivel);
        System.out.println("Preco por Litro: " + precoPorLitro);
        System.out.println("Qtd. Abastecida: " + litros);
        System.out.println("------------------------------------------------");
        System.out.println("SubTotal: " + valorTotal);
        System.out.println("Imposto Retido :" + valorImposto);
        System.out.println("Total a pagar: " + valorTotal);
        System.out.println("Valor pago (dinheiro): " + clienteDinheiro);
        System.out.println("Troco: " + troco);
        System.out.println("------------------------------------------------");
        System.out.println("Estoque restante no tanque: " + estoqueAtualLitros);
        System.out.println("================================================");
    }
}