public class mainVeiculos {
    public static void main(String[] args) {
        
        Carro carro = new Carro(4, 2010, "fiat", "Uno");

        carro.abrirPortaMalas();
        carro.exibirDados();
    }
}