public class aulaInstancia {
    public static void main(String[] args) {
        Aula a1 = new Aula();
        a1.tema = "Matemática";
        a1.pessoas = 20;
        a1.tempo = 2.5;
        a1.status();
        a1.estudar();
        a1.ensinar();

        System.out.println("--------------------------------");

        Aula a2 = new Aula();
        a2.tema = "História";
        a2.pessoas = 15;
        a2.tempo = 1.5;
        a2.status();
        a2.estudar();
        a2.ensinar();

    }
}
