public class Evento {

    private String nome;
    private String data;
    private int quantidadeParticipantes;
    private double valor;
    private Espaco espaco;

    public Evento(String data, Espaco espaco, String nome, int quantidadeParticipantes, double valor) {
        this.data = data;
        this.espaco = espaco;
        this.nome = nome;
        this.quantidadeParticipantes = quantidadeParticipantes;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getQuantidadeParticipantes() {
        return quantidadeParticipantes;
    }

    public void setQuantidadeParticipantes(int quantidadeParticipantes) {
        this.quantidadeParticipantes = quantidadeParticipantes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Espaco getEspaco() {
        return espaco;
    }

    public void setEspaco(Espaco espaco) {
        this.espaco = espaco;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data: " + data);
        System.out.println("Quantidade de participantes: " + quantidadeParticipantes);
        System.out.println("Espaco: " + espaco);
    }
    
    public void verificarCapacidade() {
        if (quantidadeParticipantes > espaco.getCapacidade()) {
            System.out.println("Espaco Inadequado! A capacidade maxima e de " + espaco.getCapacidade());
        } else {
            System.out.println("Espaco Adequado para este evento!");
        }

    }
}