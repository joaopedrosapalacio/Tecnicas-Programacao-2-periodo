public class computadorInstancia1 {
    public static void main(String[] args) {
        computador1 c1 = new computador1();
        c1.marca = "Dell";
        c1.cor = "Preto";
        c1.ligar();
        c1.status();
        c1.desligar();

        System.out.println("--------------------------------");

        computador1 c2 = new computador1();
        c2.marca = "HP";
        c2.cor = "Cinza";
        c2.ligar();
        c2.status();
        c2.desligar();
    }
}
