public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " ataca com a espada e causa dano fisico");
    }
}