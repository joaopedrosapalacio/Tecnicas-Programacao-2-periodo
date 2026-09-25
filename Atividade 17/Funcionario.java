public class Funcionario {

    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void exibirSalario() {
        System.out.println("Nome do funcionario: " + this.nome);
        System.out.println("Salario base: " + this.salarioBase);
    }
}