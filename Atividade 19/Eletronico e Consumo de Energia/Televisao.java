public class Televisao extends DispositivoEletronico{
    
    public Televisao(int potencialWatts, String marca) {
        super(potencialWatts, marca);
    }

    @Override 
    public double calcularConsumoDiario(int horaUso) {
        int kWh = potencialWatts * horaUso / 1000;
        return kWh;
    }
}
