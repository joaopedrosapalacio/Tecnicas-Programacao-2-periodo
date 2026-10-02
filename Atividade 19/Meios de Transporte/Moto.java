public class Moto extends Veiculo{
    
    public Moto(String Modelo){
        super(modelo);
    }

    @Override 
    public void acelerar() {
        System.out.println("A moto esta acelerando...");
    }
}
