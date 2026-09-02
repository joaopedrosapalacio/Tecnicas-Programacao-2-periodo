public class Aula {
    int pessoas;
    String tema;
    double tempo;

    void status() {
        System.out.println("Tema da aula: " + tema);
        System.out.println("Duração da aula: " + tempo + " horas");
        System.out.println("Número de pessoas na aula: " + pessoas);
    }
    void estudar() {
        System.out.println("Estudando o tema: " + tema);
    }
    void ensinar() {
        System.out.println("Ensinando o tema: " + tema);
    }
}
