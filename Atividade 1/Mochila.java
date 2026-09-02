public class Mochila {
    String cor;
    String modelo;
    double tamanho;
    boolean cheia;

    void status() {
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tamanho: " + this.tamanho);
    }
    void ocupar() {
        if (this.cheia == true) {
            System.out.println("A mochila está cheia.");
        } else {
            System.out.println("Você colocou itens na mochila.");
            this.cheia = true;
        }
    }
}
