public class Organizador {

    private String nome;
    private String codigo;
    private String especialidade;

    public Organizador(String codigo, String especialidade, String nome) {
        this.codigo = codigo;
        this.especialidade = especialidade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void assumirEvento(Evento evento) {
        System.out.println("Nome do organizador: " + nome);
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome do evento: " + evento.getNome());
        System.out.println("Data: " + evento.getData());
        System.out.println("Espaco onde o evento sera realizado: " + evento.getEspaco());
    }
    
}