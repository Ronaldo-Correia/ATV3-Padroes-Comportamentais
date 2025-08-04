package SmartAgenda.observer;

public class NotificarUsuario implements Observador {
    public void notificar(String mensagem) {
        System.out.println("Notificacao recebida: " + mensagem);
    }
}

