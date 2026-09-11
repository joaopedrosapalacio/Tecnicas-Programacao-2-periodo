public class sistemaEventos {
    public static void main(String[] args) {
        
        Espaco espaco = new Espaco(
            300,
            "Av. T-10, Goiânia",
            "Centro Empresarial Goiás",
            "Centro de Convenções"
        );

        Evento evento = new Evento(
            "20/10/2026",
            espaco,
            "Workshop de Inteligencia Artificial",
            180,
            15000.00
        ); 

        Organizador organizador = new Organizador(
            "ORG001",
            "Eventos corporativos",
            "Mariana Alves"
        );

        organizador.assumirEvento(evento);

        evento.verificarCapacidade();

        Espaco novoEspaco = new Espaco(
            500,
            null,
            "Teatro Municipal",
            "Auditorio"
        );

        evento.setEspaco(novoEspaco);

        evento.exibirDados();
        evento.verificarCapacidade();
    }
}