public class Escala {

    private String diaSemana;
    private String horaEntrada;
    private String horaSaida;

    public Escala(String diaSemana, String horaEntrada, String horaSaida) {
        this.setDiaSemana(diaSemana);
        this.setHoraEntrada(horaEntrada);
        this.setHoraSaida(horaSaida);
    }

    public void setDiaSemana(String diaSemana) {
        if (diaSemana == null) {
            System.out.println("O dia da semana nao pode ser nulo");
        } else {
            this.diaSemana = diaSemana;
        }
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setHoraEntrada(String horaEntrada) {
        if (horaEntrada == null) {
            System.out.println("A hora de entrada nao pode ser nula");
        } else {
            this.horaEntrada = horaEntrada;
        }
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraSaida(String horaSaida) {
        if (horaSaida == null) {
            System.out.println("A hora de saida nao pode ser nula");
        } else {
            this.horaSaida = horaSaida;
        }
    }

    public String getHoraSaida() {
        return horaSaida;
    }
}