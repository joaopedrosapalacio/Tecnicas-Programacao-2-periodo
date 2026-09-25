public class Eletronico extends Produto {

    private int voltagem;
    private int garantiaMeses;

    public Eletronico(String nome, double preco, int voltagem, int garantiaMeses) {
        super(nome, preco);
        this.voltagem = voltagem;
        this.garantiaMeses = garantiaMeses;
    }

    public void detalharGarantia() {
        System.out.println("Garantia: " + this.garantiaMeses + " meses");
    }
}