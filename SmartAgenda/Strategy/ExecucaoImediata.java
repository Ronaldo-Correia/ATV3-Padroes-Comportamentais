package SmartAgenda.Strategy;

public class ExecucaoImediata implements EstrategiaExecucao {
    @Override
    public void executar(String tarefa) {
        System.out.println("Executando imediatamente: " + tarefa);
    }
}