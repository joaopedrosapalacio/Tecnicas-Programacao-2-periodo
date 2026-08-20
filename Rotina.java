public class Rotina {
    String lugar;
    String acao;
    double horario;

    void status() {
        System.out.println("Lugar: " + lugar);
        System.out.println("Ação: " + acao);
        System.out.println("Horário: " + horario);
    }
    void definirRotina(String lugar, String acao, double horario) {
        this.lugar = lugar;
        this.acao = acao;
        this.horario = horario;
    }
    void realizarAcao() {
        System.out.println("Realizando ação: " + acao + " no lugar: " + lugar + " às " + horario);
    }
}
