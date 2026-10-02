public class ArCondicionado extends DispositivoEletronico{
    
    public ArCondicionado(int potencialWatts, String marca) {
        super(potencialWatts, marca);
    }

    @Override 
    public double calcularConsumoDiario(int horaUso) {
        int kWh = potencialWatts * horaUso / 1000;
        return kWh;
    }
}
