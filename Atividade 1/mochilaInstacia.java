public class mochilaInstacia {
    public static void main(String[] args) {
        Mochila m1 = new Mochila();
        m1.cor = "Azul";
        m1.modelo = "Esportiva";
        m1.tamanho = 20.0;
        m1.cheia = false;
        m1.status();
        m1.ocupar();

        System.out.println("------------------------------------------");
        
        Mochila m2 = new Mochila();
        m2.cor = "Verde";
        m2.modelo = "Universitária";
        m2.tamanho = 30.0;
        m2.cheia = true;
        m2.status();
        m2.ocupar();
    }
}
