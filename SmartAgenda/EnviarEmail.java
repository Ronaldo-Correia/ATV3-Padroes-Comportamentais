package SmartAgenda;

import SmartAgenda.Command.Comando;

public class EnviarEmail implements Comando {
  public void executar() {
    System.out.println("Enviando email...");
  }
  
  public void desfazer() {
    System.out.println("Desfazendo envio de email...");
  }
}
