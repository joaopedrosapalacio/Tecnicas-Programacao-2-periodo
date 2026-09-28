import java.util.ArrayList;
import java.util.List;

public class AcougueiroV2 extends FuncionarioV2 {
    
    private List <ProdutoV2> pedidosPreparados;
    
    public AcougueiroV2(int id, String nome, String cpf, String cargo){
        super(id, nome, cpf, cargo);
        this.pedidosPreparados = new ArrayList<>();
    }

    public void PrepararPedido(ArrayList array){
        System.out.println("Preparando os seguintes pedidos: "+ "\n");
        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
            pedidosPreparados.add((ProdutoV2) array.get(i));
        }
    }
}
    


