public class RelatorioJSON extends GeradorRelatorio {

    @Override
    public void exportar(String conteudo) {
        System.out.println("O texto " + conteudo + " foi estruturado em JSON");
    }
}