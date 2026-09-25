public class Carro extends Veiculos {

    private int quantidadePortas;

    public Carro(int quantidadePortas, int ano, String marca, String modelo) {
        super(ano, marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    public void abrirPortaMalas() {
        System.out.println("Abrindo o porta malas...");
    }
    
}