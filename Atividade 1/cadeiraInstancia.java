public class cadeiraInstancia {
    public static void main(String[] args) {
        Cadeira c1 = new Cadeira();
        c1.cor = "Preta";
        c1.material = "Madeira";
        c1.tamanho = 1.5;
        c1.ocupado = false;
        c1.status();
        c1.sentar();
        c1.mover();

        System.out.println("------------------------------------------");
        Cadeira c2 = new Cadeira();
        c2.cor = "Branca";
        c2.material = "Plástico";
        c2.tamanho = 1.2;
        c2.ocupado = true;
        c2.status();
        c2.sentar();
        c2.mover();
    }
}
