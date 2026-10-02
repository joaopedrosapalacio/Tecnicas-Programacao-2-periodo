public abstract class Pessoa {
    
    protected int id;
    protected String nome;
    protected String cpf;
    protected String telefone;

    public Pessoa(String cpf, int id, String nome, String telefone) {
        this.setCpf(cpf);
        this.setId(id);
        this.setNome(nome);
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            System.out.println("O id nao pode seu negativo");
        } else {
            this.id = id;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            System.out.println("O nome nao pode ser nulo");
        } else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String cpfLimpo = cpf.replace(".", "").replace("-", "").replace(" ", "");

        if (cpfLimpo.length() != 11) {
            System.out.println("CPF invalido! Deve ter 11 numeros");
            return;
        }
        for (int i = 0; i < cpfLimpo.length(); i++) {
            if (cpfLimpo.charAt(i) < '0' || cpfLimpo.charAt(i) > '9') {
                System.out.println("CPF invalido! Use apenas numeros.");
                return;
            }
        }
        this.cpf = cpfLimpo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public abstract void exibirInformacoes();

}