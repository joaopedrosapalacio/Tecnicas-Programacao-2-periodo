
import java.util.ArrayList;
import java.util.List;

public class sistemaEventos {
    public static void main(String[] args) {
        
        List<Espaco> espacolista = new ArrayList<>();
        espacolista.add(new Espaco(100, "Rua 4", "Centro de Festa", "Aniversario"));
        espacolista.add(new Espaco(300, "Avenida principal", "Espaco Lazer", "Festa"));
        espacolista.add(new Espaco(200, "Centro de Goiania", "Centro Empresarial", "Reuniao"));

        for (Espaco espacos : espacolista) {
            System.out.println(espacos.getNome());
        }

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

        try {
            Organizador organizador3 = new Organizador(
                "PTR122",
                "Organizador de Festas",
                null
            );
        } catch (NullPointerException e) {
            System.out.println("Nao e possivel acessar um nome nulo");
        } finally {
            System.out.println("Sistema continuando...");
        }
    }
}