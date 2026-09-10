public class Pessoa {

    private String nome;
    private int id;
    private String email;
    private String telefone;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String cpf) {
        this.id = id;
        setNome(nome);
        this.cpf = cpf;
    }

    public Pessoa(String cpf, String email, int id, String nome, String telefone) {
        this.cpf = cpf;
        setEmail(email);
        this.id = id;
        setNome(nome);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        try {
            if (nome == null || nome.trim().isEmpty()) {
                System.out.println("O nome nao pode ser nulo ou vazio.");
                return;
            }
            this.nome = nome;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains(".") && email.contains("@")) {
            System.out.println("Email cadastrado com sucesso.");
            this.email = email;
        } else {
            System.out.println("Email invalido. Certifique-se de que contem '@' e '.'");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone != null && (telefone.length() == 12 || telefone.length() == 13)) {
            System.out.println("Telefone cadastrado com sucesso.");
            this.telefone = telefone;
        } else {
            System.out.println("Telefone invalido. Certifique-se de que contem 12 ou 13 digitos.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (validarCPF(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF invalido.");
        }
    }

    public static boolean validarCPF(String cpf) {
        if (cpf == null) {
            return false;
        }
        cpf = cpf.replaceAll("\\D", "");

        if (cpf.length() != 11) {
            return false;
        }

        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        try {
            int soma = 0;
            int peso = 10;
            for (int i = 0; i < 9; i++) {
                int num = Character.getNumericValue(cpf.charAt(i));
                soma += num * peso;
                peso--;
            }

            int resto = 11 - (soma % 11);
            
            int digito1;
            if (resto == 10 || resto == 11) {
                digito1 = 0;
            } else {
                digito1 = resto;
            }

            if (digito1 != Character.getNumericValue(cpf.charAt(9))) {
                return false;
            }

            soma = 0;
            peso = 11;
            for (int i = 0; i < 10; i++) {
                int num = Character.getNumericValue(cpf.charAt(i));
                soma += num * peso;
                peso--;
            }

            resto = 11 - (soma % 11);
            
            int digito2;
            if (resto == 10 || resto == 11) {
                digito2 = 0;
            } else {
                digito2 = resto;
            }

            return digito2 == Character.getNumericValue(cpf.charAt(10));

        } catch (Exception e) {
            return false;
        }
    }

    public void atualizarContato(String novoEmail) {
        setEmail(novoEmail);
    }

    public void atualizarContato(String novoEmail, String novoTelefone) {
        setEmail(novoEmail);
        setTelefone(novoTelefone);
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("CPF: " + cpf);
    }

    public void exibirDados(boolean completo) {
        if (completo) {
            exibirDados();
        } else {
            System.out.println("Nome: " + nome + " | ID: " + id);
        }
    }
}