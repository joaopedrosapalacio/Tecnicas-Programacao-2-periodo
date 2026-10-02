public class mainGeradorRelatorio {
    public static void main(String[] args) {
        RelatorioPDF pdf = new RelatorioPDF();
        RelatorioJSON json = new RelatorioJSON();

        String conteudo = "Relatorio de vendas do mes";

        pdf.exportar("Relatorio de vendas do mes");
        json.exportar("Escala dos funcionarios");
    }
}