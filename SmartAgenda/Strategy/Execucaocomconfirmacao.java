package SmartAgenda.Strategy;

import java.util.Scanner;

public class Execucaocomconfirmacao implements EstrategiaExecucao {
    @Override
    public void executar(String tarefa) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Deseja executar a tarefa \"" + tarefa + "\"? (s/n): ");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            System.out.println("Executando: " + tarefa);
        } else {
            System.out.println("Execução cancelada.");
        }
    }

}
