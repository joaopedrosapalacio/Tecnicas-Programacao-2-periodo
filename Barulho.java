public class Barulho {
    boolean alto;
    boolean incomodo;
    double valorEmDecibels;

    void status() {
        System.out.println("Alto: " + alto);
        System.out.println("Incomodo: " + incomodo);
        System.out.println("Valor em Decibels: " + valorEmDecibels);
    }
    void buzinar() {
        System.out.println("Buzinando...");
    }
    void gritar() {
        System.out.println("Gritando...");
    }
}
