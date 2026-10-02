import java.util.ArrayList;
import java.util.List;

public class mainTerminal {
    public static void main(String[] args) {
        List<Pessoa> cadastroGeral = new ArrayList<>();

        Motorista motorista = new Motorista("D", "GO1111", "25/04/2030", "123.456.789-01", 1111, "Pedro", "(62)9999-0000");
        Cobrador cobrador = new Cobrador(1234, "Noturno", "098.765.432-10", 9999, "Joao", "(62)8888-1111");
        Passageiro passageiro1 = new Passageiro("ESTUDANTE", 999, 10, "111.222.333-44", 7777, "Carvalho", "(62)4444-1111");
        Passageiro passageiro2 = new Passageiro("COMUM", 777, 10, "555.666.777-88", 2222, "Henrique", "(62)7777-6666");
        Passageiro passageiro3 = new Passageiro("IDOSO", 000, 10, "999.000.111-22", 0000, "Ribeiro", "(62)0000-3333");

        cadastroGeral.add(motorista);
        cadastroGeral.add(cobrador);
        cadastroGeral.add(passageiro1);
        cadastroGeral.add(passageiro2);
        cadastroGeral.add(passageiro3);

        for (int i = 0; i < cadastroGeral.size(); i++) {
            cadastroGeral.get(i).exibirInformacoes();
            System.out.println();
        }

        Terminal terminal1 = new Terminal(1111, "Av. Brasil, 1200 - Centro", "Terminal Central");
        Terminal terminal2 = new Terminal(2222, "Rua das Palmeiras, 45 - Jardim das Flores", "Estacao Sul");
        Terminal terminal3 = new Terminal(3333, "Av. Universitária, 800 - Setor Universitário", "Terminal Norte");

        Rota rota = new Rota(1234, "Linha 10 - Expressa");
        rota.addTerminal(terminal1);
        rota.addTerminal(terminal2);
        rota.addTerminal(terminal3);

        rota.exibirItinerario();

        Onibus onibus = new Onibus(2, 2, "Volvo", "GOA4E34");
        
        passageiro1.debitarTarifa(passageiro1.calcularValorTarifa(5));
        passageiro2.debitarTarifa(passageiro2.calcularValorTarifa(5));
        passageiro3.debitarTarifa(passageiro3.calcularValorTarifa(5));

        System.out.println(passageiro1.getSaldo());
        System.out.println(passageiro2.getSaldo());
        System.out.println(passageiro3.getSaldo());
    }
}
