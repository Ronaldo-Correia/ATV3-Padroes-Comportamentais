package SmartAgenda;

import java.util.ArrayList;
import java.util.List;

import SmartAgenda.Strategy.EstrategiaExecucao;
import SmartAgenda.Strategy.ExecucaoImediata;
import SmartAgenda.Strategy.PrioridadeInsercao;
import SmartAgenda.Strategy.PrioridadeStrategy;
import SmartAgenda.observer.Observador;

public class Agenda {

    private List<Observador> observadores = new ArrayList<>();
    private List<String> tarefas = new ArrayList<>();
    private PrioridadeStrategy prioridadeStrategy = new PrioridadeInsercao();
    private EstrategiaExecucao estrategiaExecucao = new ExecucaoImediata();

    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    public void adicionarTarefa(String tarefa) {
        if (tarefa == null || tarefa.isBlank()) {
            System.out.println("Tarefa inválida.");
            return;
        }

        tarefas.add(tarefa);
        prioridadeStrategy.ordenar(tarefas);
        System.out.println("Tarefa adicionada: " + tarefa);
        notificarTodos("Nova tarefa: " + tarefa);
    }

    private void notificarTodos(String mensagem) {
        for (Observador o : observadores) {
            o.notificar(mensagem);
        }
    }

    public void executarTarefa(String tarefa) {
        estrategiaExecucao.executar(tarefa);
    }

    public void setPrioridadeStrategy(PrioridadeStrategy strategy) {
        this.prioridadeStrategy = strategy;
    }

    public void setEstrategiaExecucao(EstrategiaExecucao estrategia) {
        this.estrategiaExecucao = estrategia;
    }

    public void listarTarefas() {
        System.out.println("Tarefas na agenda:");
        for (String tarefa : tarefas) {
            System.out.println(" - " + tarefa);
        }
    }

}
