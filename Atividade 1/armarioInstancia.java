public class armarioInstancia {
    public static void main(String[] args) {
        Armario a1 = new Armario();
        a1.cor = "Branco";
        a1.material = "Madeira";
        a1.altura = 2.0;
        a1.largura = 1.5;
        a1.status();
        a1.abrir();
        a1.ocupar();
        a1.fechar();

        System.out.println("--------------------------------");

        Armario a2 = new Armario();
        a2.cor = "Preto";
        a2.material = "Metal";
        a2.altura = 1.8;
        a2.largura = 1.2;
        a2.status();
        a2.ocupar();
        a2.fechar();
        a2.abrir();
    }
}
