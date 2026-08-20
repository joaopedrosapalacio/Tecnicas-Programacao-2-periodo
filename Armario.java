public class Armario {
    String cor;
    String material;
    double altura;
    double largura;
    boolean aberto;

    void status() {
        System.out.println("Cor: " + this.cor);
        System.out.println("Material: " + this.material);
        System.out.println("Altura: " + this.altura);
        System.out.println("Largura: " + this.largura);
    }
    void abrir() {
        this.aberto = true;
        System.out.println("Armário aberto.");
    }
    void fechar() {
        this.aberto = false;
        System.out.println("Armário fechado.");
    }
    void ocupar() {
        if (this.aberto) {
            System.out.println("Armário ocupado.");
        } else {
            System.out.println("Não é possível ocupar o armário. Ele está fechado.");
        }
    }
}
