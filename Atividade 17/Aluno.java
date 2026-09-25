public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public Aluno(String curso, int matricula, int cpf, int idade, String nome) {
        super(cpf, idade, nome);
        this.curso = curso;
        this.matricula = matricula;
    }

    public void estudar() {
        System.out.println("Estudando...");
    }
}