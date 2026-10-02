public class RelatorioPDF extends GeradorRelatorio {

    @Override
    public void exportar(String conteudo) {
        System.out.println("O texto " + conteudo + " foi formatado em PDF");
    }
}