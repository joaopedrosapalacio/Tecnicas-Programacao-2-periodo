public class Reuniao {
    int pessoas;
    String tema;
    double duracao;

    void status() {
        System.out.println("Reunião com " + pessoas + " pessoas");
        System.out.println(" tema: " + tema);
        System.out.println(" duração: " + duracao + " horas.");
    }
    void lotar() {
        if (pessoas < 10) {
            System.out.println("A reunião ainda tem vagas.");
        } else {
            System.out.println("A reunião está lotada.");
        }
    }
    void falar() {
        System.out.println("Falando");
    }
}
