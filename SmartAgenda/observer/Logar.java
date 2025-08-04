package SmartAgenda.observer;

public class Logar implements Observador {
    public void notificar(String mensagem){
        System.out.println("Log: " + mensagem);
    }
    
}
