package SmartAgenda.Command;

public class TocarAlarme implements Comando {

    public void executar() {
        System.out.println("Tocando alarme...");
    }

    public void desfazer() {
        System.out.println("Desfazendo toque de alarme...");
    }

}
