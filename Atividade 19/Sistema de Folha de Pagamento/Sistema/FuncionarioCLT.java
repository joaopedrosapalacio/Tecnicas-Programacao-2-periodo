public class FuncionarioCLT extends Funcionario {
    
    private double salarioFixo;

    public FuncionarioCLT(String nome, double salarioFixo) {
        super(nome);
        this.salarioFixo = salarioFixo;
    }

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
    
    @Override 
    public double calcularSalario() {
        System.out.print("Seu salario e de: ");
        return salarioFixo;
    }
}
