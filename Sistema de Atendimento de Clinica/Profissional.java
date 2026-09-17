public class Profissional {

    private String nome;
    private String registro;
    private String especialidade;

    public Profissional(String especialidade, String nome, String registro) {
        this.especialidade = especialidade;
        this.nome = nome;
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Registro: " + this.registro);
        System.out.println("Especialidade: " + this.especialidade);
    }
    
    public boolean verificarEspecialidade(String especialidade) {
        if (!especialidade.isEmpty()) {
            return true;
        } else {
            System.out.println("Atendimento com especialista");
            return false;
        }
    }
}