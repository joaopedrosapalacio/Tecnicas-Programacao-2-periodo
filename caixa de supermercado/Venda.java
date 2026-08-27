import java.util.Scanner;

public class Venda {

    public static String abreviarCategoria(String categoria) {
        String sigla;

        if (categoria.equals("Cesta Basica")) {
            sigla = "C.Basica";
        } else if (categoria.equals("Produtos de Limpeza")) {
            sigla = "Limpeza";
        } else if (categoria.equals("Bebidas")) {
            sigla = "Bebidas";
        } else if (categoria.equals("Geral")) {
            sigla = "Geral";
        } else {
            sigla = categoria;
        }

        return sigla;
    }

    public static String formatarValor(double valor) {
        int parteInteira = (int) valor;
        double resto = valor - parteInteira;
        int parteDecimal = (int) (resto * 100 + 0.5);

        String textoDecimal;
        if (parteDecimal < 10) {
            textoDecimal = "0" + parteDecimal;
        } else {
            textoDecimal = "" + parteDecimal;
        }

        return parteInteira + "," + textoDecimal;
    }

    public static void imprimirCupom(Produto2[] carrinho, int[] quantidades, double subtotal, double impostoGeral, double totalCompra, double valorPago, double troco) {

        System.out.println("================================================");
        System.out.println("          CUPOM FISCAL - SUPERMERCADO");
        System.out.println("================================================");
        System.out.println("Item | Nome                  | Qtd | Pr.Unit | Total");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < carrinho.length; i++) {
            Produto2 p = carrinho[i];
            int qtd = quantidades[i];
            double totalItem = p.getPrecoUnitario() * qtd;

            String nomeComCategoria = p.getNome() + " (" + abreviarCategoria(p.getCategoria()) + ")";

            System.out.println((i + 1) + " | " + nomeComCategoria + " | " + qtd
                    + " | R$ " + formatarValor(p.getPrecoUnitario())
                    + " | R$ " + formatarValor(totalItem));
        }

        System.out.println("------------------------------------------------");
        System.out.println("SUBTOTAL: R$ " + formatarValor(subtotalGeral));
        System.out.println("TOTAL DE IMPOSTOS: R$ " + formatarValor(impostoGeral));
        System.out.println("TOTAL A PAGAR: R$ " + formatarValor(totalCompra));
        System.out.println("VALOR RECEBIDO: R$ " + formatarValor(valorPago));
        System.out.println("TROCO: R$ " + formatarValor(troco));
        System.out.println("================================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos produtos quer comprar?");
        int quantidadeItens = scanner.nextInt();
        scanner.nextLine();

        Produto2[] carrinho = new Produto2[quantidadeItens];
        int[] quantidades = new int[quantidadeItens];

        System.out.println("Adicione os produtos no carrinho");
        for (int i = 0; i < carrinho.length; i++) {
            System.out.println("Nome: ");
            String nome = scanner.nextLine();

            System.out.println("Preco: ");
            double precoUnitario = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Codigo: ");
            int codigo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Quantidade no estoque: ");
            int quantidadeEstoque = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Categoria: ");
            String categoria = scanner.nextLine();

            carrinho[i] = new Produto2(nome, codigo, precoUnitario, quantidadeEstoque, categoria);

            System.out.println("Quantos itens desse produto voce vai levar?");
            int qtdComprada = scanner.nextInt();
            scanner.nextLine();

            boolean baixaOk = carrinho[i].darBaixa(qtdComprada);

            if (baixaOk) {
                quantidades[i] = qtdComprada;
            } else {
                quantidades[i] = 0;
                System.out.println("Item nao sera cobrado por falta de estoque");
            }
        }

        double subtotalGeral = 0;
        double impostoGeral = 0;

        for (int i = 0; i < carrinho.length; i++) {
            Produto2 p = carrinho[i];
            int qtd = quantidades[i];

            double subtotalItem = p.getPrecoUnitario() * qtd;
            double impostoItem = p.calcularImposto() * qtd;

            subtotalGeral = subtotalGeral + subtotalItem;
            impostoGeral = impostoGeral + impostoItem;

            System.out.println(p.getNome() + " - Subtotal: R$ " + formatarValor(subtotalItem)
                    + " | Imposto: R$ " + formatarValor(impostoItem));
        }

        double totalCompra = subtotalGeral + impostoGeral;

        System.out.println("Subtotal geral: R$ " + formatarValor(subtotalGeral));
        System.out.println("Imposto geral: R$ " + formatarValor(impostoGeral));
        System.out.println("TOTAL A PAGAR: R$ " + formatarValor(totalCompra));

        System.out.print("Valor pago em dinheiro: R$ ");
        double valorPago = scanner.nextDouble();

        if (valorPago < totalCompra) {
            double faltando = totalCompra - valorPago;
            System.out.println("Saldo insuficiente! Faltam R$ " + formatarValor(faltando));
        } else {
            double troco = valorPago - totalCompra;
            System.out.println("Pagamento aprovado! Troco: R$ " + formatarValor(troco));

            imprimirCupom(carrinho, quantidades, subtotalGeral, impostoGeral, totalCompra, valorPago, troco);
        }
    }
}