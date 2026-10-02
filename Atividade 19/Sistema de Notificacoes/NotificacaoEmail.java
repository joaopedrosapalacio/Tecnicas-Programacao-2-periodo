public class NotificacaoEmail extends Notificacao{

    private String emailDestinado;

    public NotificacaoEmail(String emailDestinado, String mensagem) {
        super(mensagem);
        this.emailDestinado = emailDestinado;
    }

    public String getEmailDestinado() {
        return emailDestinado;
    }

    public void setEmailDestinado(String emailDestinado) {
        this.emailDestinado = emailDestinado;
    }

    @Override 
    public void enviar() {
        System.out.println(getMensagem());
    }
    
}
