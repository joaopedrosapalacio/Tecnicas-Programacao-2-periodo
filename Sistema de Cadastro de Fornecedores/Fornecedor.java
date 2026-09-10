public class Fornecedor {

    private int codigo;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String email;
    private String telefone;

    public Fornecedor() {
    }

    public Fornecedor(int codigo, String razaoSocial, String cnpj) {
        this.codigo = codigo;
        setRazaoSocial(razaoSocial);
        setCnpj(cnpj);
    }

    public Fornecedor(int codigo, String razaoSocial, String nomeFantasia, String cnpj, String email, String telefone) {
        this.codigo = codigo;
        setRazaoSocial(razaoSocial);
        this.nomeFantasia = nomeFantasia;
        setCnpj(cnpj);
        setEmail(email);
        setTelefone(telefone);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        try {
            if (razaoSocial == null || razaoSocial.trim().isEmpty()) {
                System.out.println("A razao social nao pode ser nula ou vazia.");
                return;
            }
            this.razaoSocial = razaoSocial;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        try {
            if (nomeFantasia == null || nomeFantasia.trim().isEmpty()) {
                System.out.println("O nome fantasia nao pode ser nulo ou vazio.");
                return;
            }
            this.nomeFantasia = nomeFantasia;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (validarCNPJ(cnpj)) {
            this.cnpj = cnpj;
        } else {
            System.out.println("CNPJ invalido.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains(".") && email.contains("@")) {
            System.out.println("Email cadastrado com sucesso.");
            this.email = email;
        } else {
            System.out.println("Email invalido. Certifique-se de que contem '@' e '.'.");
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

    public static boolean validarCNPJ(String cnpj) {
        if (cnpj == null) {
            return false;
        }

        cnpj = cnpj.replaceAll("\\D", "");

        if (cnpj.length() != 14) {
            return false;
        }

        if (cnpj.matches("(\\d)\\1{13}")) {
            return false;
        }

        try {
            int soma = 0;
            int[] peso1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
            for (int i = 0; i < 12; i++) {
                int num = Character.getNumericValue(cnpj.charAt(i));
                soma += num * peso1[i];
            }

            int resto = soma % 11;
            int digito1;
            if (resto < 2) {
                digito1 = 0;
            } else {
                digito1 = 11 - resto;
            }

            if (digito1 != Character.getNumericValue(cnpj.charAt(12))) {
                return false;
            }

            soma = 0;
            int[] peso2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
            for (int i = 0; i < 13; i++) {
                int num = Character.getNumericValue(cnpj.charAt(i));
                soma += num * peso2[i];
            }

            resto = soma % 11;
            int digito2;
            if (resto < 2) {
                digito2 = 0;
            } else {
                digito2 = 11 - resto;
            }

            return digito2 == Character.getNumericValue(cnpj.charAt(13));

        } catch (Exception e) {
            return false;
        }
    }

    public boolean validarCNPJ() {
        return validarCNPJ(this.cnpj);
    }

    public void atualizarContato(String novoEmail) {
        setEmail(novoEmail);
    }

    public void atualizarContato(String novoEmail, String novoTelefone) {
        setEmail(novoEmail);
        setTelefone(novoTelefone);
    }

    public void exibirDados() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Razao Social: " + razaoSocial);
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
    }

    public void exibirDados(boolean completo) {
        if (completo) {
            exibirDados();
        } else {
            System.out.println("Codigo: " + codigo + " | Razao Social: " + razaoSocial + " | CNPJ: " + cnpj);
        }
    }
}