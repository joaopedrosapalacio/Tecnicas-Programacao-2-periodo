import java.util.ArrayList;
import java.util.List;

public class Rota {
    
    private int codigoLinha;
    private String nomeLinha;
    private List<Terminal> rotas = new ArrayList<>();

    public Rota(int codigoLinha, String nomeLinha) {
        this.codigoLinha = codigoLinha;
        this.nomeLinha = nomeLinha;
    }

    public int getCodigoLinha() {
        return codigoLinha;
    }

    public void setCodigoLinha(int codigoLinha) {
        this.codigoLinha = codigoLinha;
    }

    public String getNomeLinha() {
        return nomeLinha;
    }

    public void setNomeLinha(String nomeLinha) {
        this.nomeLinha = nomeLinha;
    }

    public List<Terminal> getRotas() {
        return rotas;
    }

    public void setRotas(List<Terminal> rotas) {
        this.rotas = rotas;
    }

    public void addTerminal(Terminal terminal) {
        rotas.add(new Terminal(terminal.getIdTerminal(), terminal.getNome(), terminal.getLocalizacao()));
    }

    public void removerTerminal(int remover) {
        rotas.remove(remover);
    }

    public void imprimirTerminais() {
        for (Terminal terminal : rotas) {
            System.out.println(terminal.getNome());
        }
    }

    public void exibirItinerario() {
        System.out.println("Itinerário da Rota " + codigoLinha + " - " + nomeLinha + ":");
        for (int i = 0; i < rotas.size(); i++) {
            System.out.println((i + 1) + ". " + rotas.get(i).getNome()
                    + " (" + rotas.get(i).getLocalizacao() + ")");
        }
    }
}
