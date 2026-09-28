public class FuncionarioV2 {

    protected int id;
    protected String nome;
    protected String cpf;
    protected String cargo;

    public FuncionarioV2(int id, String nome, String cpf, String cargo) {
        this.setId(id);
        this.setNome(nome);
        this.setCpf(cpf);
        this.cargo = cargo;
    }

    public void baterPontoEntrada(Escala escala) {
        System.out.println("Insira o dia da semana: ");
        System.out.println("Insira o horario de inicio da atividade do dia " + escala.getDiaSemana() + ": ");
    }

    public void baterPontoSaida(Escala escala) {
        System.out.println("Insira o horario de fim da atividade do dia " + escala.getDiaSemana() + ": ");
    }

    public void exibirEscala(Escala escala) {
        System.out.println("Dia da semana: " + escala.getDiaSemana());
        System.out.println("Horario de entrada: " + escala.getHoraEntrada());
        System.out.println("Horario de saida: " + escala.getHoraSaida());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            System.out.println("Erro ao cadastrar ID: O ID nao pode ser negativo");
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}