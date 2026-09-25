public class mainFuncionario {
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente(600, "Organizacoes", "Gabriel", 3000);

        gerente.calcularSalarioTotal();
        gerente.exibirSalario();
    }
}