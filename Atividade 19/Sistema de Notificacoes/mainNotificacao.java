public class mainNotificacao {
    public static void main(String[] args) {
        NotificacaoSMS sms = new NotificacaoSMS(629990000, "Ola, tudo bem?");
        NotificacaoEmail email = new NotificacaoEmail("joao pedro", "Vamos para o parque?");

        sms.enviar();
        email.enviar();
    }
}
