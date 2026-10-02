public abstract class Forma {
    
    public abstract double calcularArea();

    public void imprimirArea(){
        System.out.println("Sua area total e: " + calcularArea());
    }
}
