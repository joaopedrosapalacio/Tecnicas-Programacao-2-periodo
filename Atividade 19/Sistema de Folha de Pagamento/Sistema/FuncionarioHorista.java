public class FuncionarioHorista extends Funcionario{
    
    private double horasTrabalhadas;
    private double valorHora;
	
    public FuncionarioHorista(String nome, double horasTrabalhadas, double valorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

    @Override 
    public double calcularSalario() {
        System.out.print("Seu salario e de: ");
        return horasTrabalhadas * valorHora;
    }
}
