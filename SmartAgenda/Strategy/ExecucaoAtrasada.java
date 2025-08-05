package SmartAgenda.Strategy;

public class ExecucaoAtrasada implements EstrategiaExecucao {
    @Override
    public void executar(String tarefa) {
        System.out.println("Executando com atraso: " + tarefa);

    }
}
