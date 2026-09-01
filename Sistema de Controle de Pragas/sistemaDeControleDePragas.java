import java.util.Scanner;

public class sistemaDeControleDePragas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID do talhao: ");
        int idTalho = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a cultura (ex: Soja, Milho): ");
        String cultura = scanner.nextLine();

        System.out.print("Digite a area tratada (em hectares): ");
        double areaHectares = scanner.nextDouble();

        System.out.print("Digite o nivel de infestacao atual (em %): ");
        double nivelInfestacao = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite o nome do defensivo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a classe do defensivo (ex: Classe 3, Classe 4): ");
        String classe = scanner.nextLine();

        String tipoDePraga = "Lagarta";
        double dosagemPorHectare = 2.0;
        double precoPorLitro = 45.0;
        double estoqueLitros = 500.0;
        double percentualEficacia = 50.0;

        Talho talho = new Talho(idTalho, cultura, areaHectares, nivelInfestacao);
        Defensivo defensivo = new Defensivo(nome, tipoDePraga, dosagemPorHectare, precoPorLitro, estoqueLitros, percentualEficacia);
        OrdemDeAplicacao ordem = new OrdemDeAplicacao();

        double quantidadeAplicadaTotal = defensivo.aplicar(talho.getAreaHectares());

        double novaInfestacao = ordem.eficacia(talho.getNivelInfestacao(), defensivo.getPercentualEficacia());

        double custoInsumo = quantidadeAplicadaTotal * defensivo.getPrecoPorLitro();

        double percentualTaxa = ordem.taxaAmbiental(classe);
        double valorTaxaAmbiental = custoInsumo * percentualTaxa;

        double custoTotalOperacao = ordem.calcularCustoAplicacao(talho, defensivo, classe);

        ordem.imprimirRelatorio(
            talho.getIdTalho(),
            talho.getCultura(),
            talho.getAreaHectares(),
            defensivo.getNome(),
            classe,
            quantidadeAplicadaTotal,
            talho.getNivelInfestacao(),
            novaInfestacao,
            custoInsumo,
            valorTaxaAmbiental,
            custoTotalOperacao,
            defensivo.getEstoqueLitros()
        );
    }
}