public class Cadeira {
    String cor;
    String material;
    double tamanho;
    boolean ocupado;

    void status() {
        System.out.println("Cor: " + this.cor);
        System.out.println("Material: " + this.material);
        System.out.println("Tamanho: " + this.tamanho);
    }
    void sentar() {
        if (this.ocupado == true) {
            System.out.println("A cadeira está ocupada.");
        } else {
            System.out.println("Você se sentou na cadeira.");
            this.ocupado = true;
        }
    }
    void mover() {
        System.out.println("A cadeira foi movida.");
    }
}
