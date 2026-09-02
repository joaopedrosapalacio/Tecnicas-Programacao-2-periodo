public class reuniaoInstancia {
    public static void main(String[] args) {
        Reuniao r1 = new Reuniao();
        r1.tema = "Animal";
        r1.duracao = 2.0;
        r1.pessoas = 10;
        r1.status();
        r1.lotar();
        r1.falar();

        System.out.println("--------------------------------");

        Reuniao r2 = new Reuniao();
        r2.tema = "Tecnologia";
        r2.duracao = 1.5;
        r2.pessoas = 5;
        r2.status();
        r2.lotar();
        r2.falar();

    }
}
