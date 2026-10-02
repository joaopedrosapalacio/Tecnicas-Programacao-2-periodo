public class Terminal {
    
    private int idTerminal;
    private String nome;
    private String localizacao;

    public Terminal(int idTerminal, String localizacao, String nome) {
        this.idTerminal = idTerminal;
        this.localizacao = localizacao;
        this.nome = nome;
    }

    public int getIdTerminal() {
        return idTerminal;
    }

    public void setIdTerminal(int idTerminal) {
        this.idTerminal = idTerminal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }


}
