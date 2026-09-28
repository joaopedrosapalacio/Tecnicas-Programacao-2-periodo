public class AssistenteV2 extends FuncionarioV2 {

    public AssistenteV2(int id, String nome, String cpf, String cargo) {
        super(id, nome, cpf, cargo);
    }

    public boolean abrir(Caixa caixa) {
        if (caixa.getStatus() == true) {
            System.out.println("O caixa ja esta aberto");
        } else {
            System.out.println("Abrindo caixa...");
            caixa.setStatus(true);
        }
        return caixa.getStatus();
    }

    public boolean fechar(Caixa caixa) {
        if (caixa.getStatus() == false) {
            System.out.println("O caixa ja esta fechado");
        } else {
            System.out.println("Fechando caixa...");
            caixa.setStatus(false);
        }
        return caixa.getStatus();
    }

    public void baterPontoEntrada(Escala escala) {
        super.baterPontoEntrada(escala);
    }

    public void baterPontoSaida(Escala escala) {
        super.baterPontoSaida(escala);
    }

    public void exibirEscala(Escala escala) {
        super.exibirEscala(escala);
    }

    public void registrarVenda(Caixa caixa, double total, double pagamento) {
        if (caixa.getStatus() == false) {
            System.out.println("O caixa esta fechado, abra o caixa antes de registrar a venda");
        } else {
            caixa.registrarVenda(pagamento, total, 0);
        }
    }
}