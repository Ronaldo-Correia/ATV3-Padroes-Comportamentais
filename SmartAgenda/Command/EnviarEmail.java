package SmartAgenda.Command;

public class EnviarEmail implements Comando {
  public void executar() {
    System.out.println("Enviando email...");
  }
  
  public void desfazer() {
    System.out.println("Desfazendo envio de email...");
  }
}
