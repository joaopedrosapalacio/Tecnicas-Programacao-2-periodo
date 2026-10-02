public abstract class Documento {

    protected String numero;

    public Documento(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public abstract boolean validar();
}
