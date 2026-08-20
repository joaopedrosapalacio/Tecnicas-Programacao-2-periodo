public class Computador {
    String marca;
    String cor;
    boolean ligado;

    void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ligado: " + this.ligado);
    }
    void ligar() {
        this.ligado = true;
    }
    void desligar() {
        this.ligado = false;
    }
}
