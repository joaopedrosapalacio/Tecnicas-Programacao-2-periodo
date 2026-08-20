public class cadernoInstancia {
    public static void main(String[] args) {
        Caderno c1 = new Caderno();
        c1.cor = "Preto";
        c1.folha = true;
        c1.modelo = "Capa dura";
        c1.status();
        c1.rabiscar();
        c1.rasgar();

        System.out.println("------------------------------------------------------");

        Caderno c2 = new Caderno();
        c2.cor = "Azul";
        c2.folha = false;
        c2.modelo = "Capa mole";
        c2.status();
        c2.rabiscar();
        c2.rasgar();
    }
}
