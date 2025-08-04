package SmartAgenda.observer;

public class SugestaoAcao implements Observador {
    public void notificar(String mensagem) {
        System.out.println("Sugestao de acao: " + mensagem);
    }

}