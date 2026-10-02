public class mainPersonagem {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Thorin");
        Mago mago = new Mago("Merlin");

        guerreiro.atacar();
        mago.atacar();
    }
}
