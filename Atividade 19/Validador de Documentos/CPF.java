public class CPF extends Documento {

    public CPF(String numero) {
        super(numero);
    }

    @Override
    public boolean validar() {
        if (numero.length() != 11) {
            return false;
        }
        for (int i = 0; i < numero.length(); i++) {
            if (!Character.isDigit(numero.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}