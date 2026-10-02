public class CNPJ extends Documento {

    public CNPJ(String numero) {
        super(numero);
    }

    @Override
    public boolean validar() {
        return numero.length() == 14;
    }
}