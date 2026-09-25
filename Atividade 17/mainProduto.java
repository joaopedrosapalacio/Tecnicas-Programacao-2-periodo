public class mainProduto {
    public static void main(String[] args) {
        
        Eletronico eletronico = new Eletronico("Fone", 200, 220, 12);

        eletronico.exibirEtiqueta();
        eletronico.detalharGarantia();
    }
}