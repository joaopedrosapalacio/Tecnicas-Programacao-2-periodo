public class mainDocumento {
    public static void main(String[] args) {
        CPF cpf = new CPF("12345678901");
        CNPJ cnpj = new CNPJ("12345678000199");

        cpf.validar();
        cnpj.validar();
    }
}