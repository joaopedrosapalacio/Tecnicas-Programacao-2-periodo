public class Motorista extends Pessoa {
    
    private String numeroCnh;
    private String categoriaCnh;
    private String validadeCnh;

    public Motorista(String categoriaCnh, String numeroCnh, String validadeCnh, String cpf, int id, String nome, String telefone) {
        super(cpf, id, nome, telefone);
        this.categoriaCnh = categoriaCnh;
        this.numeroCnh = numeroCnh;
        this.validadeCnh = validadeCnh;
    }

    public String getNumeroCnh() {
        return numeroCnh;
    }

    public void setNumeroCnh(String numeroCnh) {
        this.numeroCnh = numeroCnh;
    }

    public String getCategoriaCnh() {
        return categoriaCnh;
    }

    public void setCategoriaCnh(String categoriaCnh) {
        this.categoriaCnh = categoriaCnh;
    }

    public String getValidadeCnh() {
        return validadeCnh;
    }

    public void setValidadeCnh(String validadeCnh) {
        this.validadeCnh = validadeCnh;
    }
    @Override 
    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("ID: " + this.id);
        System.out.println("Numero da CNH: " + this.numeroCnh);
        System.out.println("Categoria da CNH: " + this.categoriaCnh);
        System.out.println("Validade da CNH: " + this.validadeCnh);
    }
}
