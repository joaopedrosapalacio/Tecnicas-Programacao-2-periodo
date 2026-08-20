public class Tempo {
    int hora;
    int minuto;
    int segundo;

    void status() {
        System.out.println("Hora: " + this.hora);
        System.out.println("Minuto: " + this.minuto);
        System.out.println("Segundo: " + this.segundo);
    }
    void ajustarHora(int h, int m, int s) {
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }
    void exibirHora() {
        System.out.println("Hora: " + this.hora + ":" + this.minuto + ":" + this.segundo);
    }
}
