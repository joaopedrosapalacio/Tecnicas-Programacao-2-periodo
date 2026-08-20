public class tempoInstancia {
    public static void main(String[] args) {
        Tempo t1 = new Tempo();
        t1.ajustarHora(10, 30, 45);
        t1.status();
        t1.exibirHora();

        System.out.println("--------------------------------");

        Tempo t2 = new Tempo();
        t2.ajustarHora(15, 45, 20);
        t2.status();
        t2.exibirHora();
    }
}
