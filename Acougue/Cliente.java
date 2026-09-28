public class Cliente {

    private String nome;
    private String telefone;
    private String cpf;
    private String endereco;

    public Cliente(String nome, String telefone, String cpf, String endereco) {
        this.setNome(nome);
        this.telefone = telefone;
        this.setCpf(cpf);
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        if (nome == null) {
            System.out.println("O nome nao pode ser nulo");
        } else {
            this.nome = nome;
        }
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        try {
            if (cpf == null) {
                throw new IllegalArgumentException("O CPF nao pode ser nulo.");
            }

            String cpfLimpo = "";

            for (int i = 0; i < cpf.length(); i++) {
                char c = cpf.charAt(i);

                if (c == '.' || c == '-') {

                } else if (c >= '0' && c <= '9') {
                    cpfLimpo += c;
                } else {
                    throw new IllegalArgumentException("O CPF contem caracteres invalidos.");
                }
            }

            if (cpfLimpo.length() == 11) {
                this.cpf = cpfLimpo;
            } else {
                throw new IllegalArgumentException("O CPF deve conter exatamente 11 digitos numericos.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir o CPF: " + e.getMessage());
        }
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }
}