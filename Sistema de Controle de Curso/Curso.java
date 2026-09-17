public class Curso {

    private int codigo;
    private String nome;
    private double cargaHoraria;
    private double valor;

    public Curso() {

    }

    public Curso(double cargaHoraria, String nome, double valor) {
        setCargaHoraria(cargaHoraria);
        setNome(nome);
        setValor(valor);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        try {
            this.nome = nome;
        } catch (NullPointerException e) {
            System.out.println("Nome invalido");
            e.getMessage();
        }
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        if (cargaHoraria < 0) {
            System.out.println("Carga Horaria invalida");
        }
        this.cargaHoraria = cargaHoraria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 0) {
            System.out.println("Valor invalido");
        }
        this.valor = valor;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Carga Horaria: " + this.cargaHoraria);
        System.out.println("Valor: " + this.valor);
    }

    public double calcularValorPorHora(double valor, double cargaHoraria) {
        double valorPorHora = this.valor / this.cargaHoraria;
        if (valorPorHora < 0) {
            System.out.println("O preco do curso nao pode ser negativo");
        }
        return valorPorHora;
    }

    public boolean validarCurso() {
        if (!nome.isEmpty() && cargaHoraria > 0 && valor > 0) {
            return true;
        } else {
            return false;
        }
    }
}