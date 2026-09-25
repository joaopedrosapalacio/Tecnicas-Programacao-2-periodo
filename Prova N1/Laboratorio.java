
import java.util.ArrayList;
import java.util.List;

public class Laboratorio {

    private String nome;
    private List<Robo> robos;

    public Laboratorio(String nome) {
        this.nome = nome;
        this.robos = new ArrayList<>();
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarRobo(Robo robo) {
        robos.add(robo);
    }

    public void listarRobos() {
        for (Robo robo : robos) {
            System.out.println(robo.getCodigo() + " " + robo.getNome() + " " + robo.getTipo() + " " + robo.getBateria() + " " + robo.isAtivo());
            System.out.println();
        }
    }

    public Robo buscarRobo(int codigo) {
        for (Robo robo : robos) {
            if (robo.getCodigo() == codigo) {
                return robo;
            }
        }
        return null;
    }

    public int contarRobosAtivos() {
        System.out.println("Quantidade de robos ativos: ");
        return robos.size();
    } 
}