public class OrdemDeAplicacao {
    public double taxaAmbiental(String classe) {
        double taxa = 0.0;
        switch (classe) {
            case "Classe 4" -> taxa = 0.05;
            case "Classe 3" -> taxa = 0.08;
            case "Classe 2" -> taxa = 0.12;
            case "Classe 1" -> taxa = 0.12;
            default -> System.out.println("Classe não reconhecida para cálculo da taxa ambiental.");
        }
        return taxa;
    }

    public double estoqueDefensivo(double estoquePorLitros, double areaHectares) {
        if (estoquePorLitros < areaHectares) {
            System.out.println("Estoque insuficiente para aplicar o defensivo na área especificada.");
            return 0.0;
        } else {
            estoquePorLitros -= areaHectares;
        }
        return estoquePorLitros;
    }

    public double eficacia(double nivelInfestacao, double percentualEficacia) {
        return nivelInfestacao - (nivelInfestacao * percentualEficacia / 100);
    }

    public double calcularCustoAplicacao(Talho talho, Defensivo defensivo, String classePericulosidade) {

        double quantidadeNecessaria = talho.getAreaHectares() * defensivo.getDosagemPorHectare();
        double custoProduto = quantidadeNecessaria * defensivo.getPrecoPorLitro();

        double taxaPercentual = 0.0;
        switch (classePericulosidade) {
            case "Classe IV" -> taxaPercentual = 0.05;
            case "Classe III" -> taxaPercentual = 0.08;
            case "Classe II", "Classe I" -> taxaPercentual = 0.12;
            default -> {
            }
        }

        return custoProduto + (custoProduto * taxaPercentual);
    }

    public void imprimirRelatorio(int idTalho, String Cultura, double areaHectares, String nome, String classe, double dosagemPorHectare, double nivelInfestacao, double eficacia, double quantidadeNecessaria, double taxaAmbiental, double custoProduto, double estoquePorLitros) {
        System.out.println("================================================");
        System.out.println("RELATORIO DE APLICACAO DE DEFENSIVO");
        System.out.println("================================================");
        System.out.println("Talhao ID: " + idTalho + "( Cultura: " + Cultura + ")");
        System.out.println("Area Tratada: " + areaHectares + " hectares");
        System.out.println("Defensivo Utilizado: " + nome + " (Classe: " + classe + ")");
        System.out.println("Dosagem Aplicada: " + dosagemPorHectare  + " Litros Total");
        System.out.println("------------------------------------------------");
        System.out.println("Infestacao Anterior: " + nivelInfestacao + "%");
        System.out.println("Nova Infestacao: " + eficacia + "%");
        System.out.println("------------------------------------------------");
        System.out.println("Custo Insumos: RS" + quantidadeNecessaria);
        System.out.println("Taxa Ambiental: " + taxaAmbiental);
        System.out.println("CUSTO TOTAL OPERACAO: " + custoProduto);
        System.out.println("Estoque restante Produto: " + estoquePorLitros);
        System.out.println("================================================");
    }
}