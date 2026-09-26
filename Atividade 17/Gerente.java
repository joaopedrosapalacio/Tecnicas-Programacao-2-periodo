public class Gerente extends Funcionario {

    private String departamento;
    private double bonificacao;
    private double salarioBase;

    public Gerente(double bonificacao, String departamento, String nome, double salarioBase) {
        super(nome, salarioBase);
        this.bonificacao = bonificacao;
        this.departamento = departamento;
    }

    public double calcularSalarioTotal() {
        return salarioBase + bonificacao;
    }

    public void exibirSalario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirSalario'");
    }
}