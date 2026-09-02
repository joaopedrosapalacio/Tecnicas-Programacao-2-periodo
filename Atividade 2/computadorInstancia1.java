public class computadorInstancia {
    public static void main(String[] args) {
        Computador c1 = new Computador();
        c1.marca = "Dell";
        c1.cor = "Preto";
        c1.ligar();
        c1.status();
        c1.desligar();

        System.out.println("--------------------------------");

        Computador c2 = new Computador();
        c2.marca = "HP";
        c2.cor = "Cinza";
        c2.ligar();
        c2.status();
        c2.desligar();
    }
}
