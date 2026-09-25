public class Veiculos {

    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculos(int ano, String marca, String modelo) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirDados() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
    
}