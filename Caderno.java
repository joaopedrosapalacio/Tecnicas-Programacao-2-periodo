public class Caderno {
    String cor;
    boolean folha;
    String modelo;

    void status() {
        System.out.println("Cor: " + cor);
        System.out.println("Folha: " + folha);
        System.out.println("Modelo: " + modelo);
    }
    void rabiscar() {
        if (folha == true) {
            System.out.println("Rabiscando...");
        } else {
            System.out.println("Não posso rabiscar");
        }
    }
    void rasgar() {
        if (folha == true) {
            System.out.println("Rasgando...");
        } else {
            System.out.println("Não posso rasgar");
        }
    }
}