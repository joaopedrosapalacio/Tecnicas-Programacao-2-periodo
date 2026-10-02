public class Cobrador extends Pessoa {
    
    private int matricula;
    private String turno;

    public Cobrador(int matricula, String turno, String cpf, int id, String nome, String telefone) {
        super(cpf, id, nome, telefone);
        this.matricula = matricula;
        this.turno = turno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override 
    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("ID: " + this.id);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Turno: " + this.turno);
    }
}
