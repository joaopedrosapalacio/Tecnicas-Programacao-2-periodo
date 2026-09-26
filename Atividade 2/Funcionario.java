public class Funcionario {

    private int matricula;
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario() {}

    public Funcionario(String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(int matricula2, String nome2, String cargo2, double salario2) {
        //TODO Auto-generated constructor stub
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void listar() {
        System.out.println("Matricula: " + matricula + 
                           " | Nome: " + nome + 
                           " | Cargo: " + cargo + 
                           " | Salario: R$ " + String.format("%.2f", salario));
    }
}