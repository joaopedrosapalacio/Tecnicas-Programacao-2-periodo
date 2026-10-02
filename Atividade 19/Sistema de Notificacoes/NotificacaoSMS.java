public class NotificacaoSMS extends Notificacao{

    private int telefone;

    public NotificacaoSMS(int telefone, String mensagem) {
        super(mensagem);
        this.telefone = telefone;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    @Override 
    public void enviar(){
        System.out.println(getMensagem());
    }
}
