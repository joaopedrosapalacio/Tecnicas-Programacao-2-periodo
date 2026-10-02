public class DispositivoEletronico {
    protected String marca;
    protected int potencialWatts;

    public DispositivoEletronico(String marca, int potencialWatts) {
        this.marca = marca;
        this.potencialWatts = potencialWatts;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencialWatts() {
        return potencialWatts;
    }

    public void setPotencialWatts (int potencialWatts) {
        this.potencialWatts = potencialWatts;
    }

    public abstract double calcularConsumoDiario(int horasUso);
}
