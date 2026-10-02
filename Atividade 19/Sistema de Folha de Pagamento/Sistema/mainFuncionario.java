public class mainFuncionario {
    public static void main(String[] args) {
        FuncionarioCLT clt = new FuncionarioCLT("Joao", 1600);
        FuncionarioHorista horista = new FuncionarioHorista("Pedro", 8, 50);

        clt.calcularSalario();
        horista.calcularSalario();
    }
}
