package SmartAgenda;

import java.util.ArrayList;
import java.util.List;

import SmartAgenda.Strategy.EstrategiaExecucao;
import SmartAgenda.Strategy.ExecucaoImediata;
import SmartAgenda.Strategy.PrioridadeInsercao;
import SmartAgenda.Strategy.PrioridadeStrategy;
import SmartAgenda.observer.Observador;

public class Agenda {

    // Lista de observadores, tarefas e estratégias;
    private List<Observador> observadores = new ArrayList<>();
    private List<String> tarefas = new ArrayList<>();
    private PrioridadeStrategy prioridadeStrategy = new PrioridadeInsercao();
    private EstrategiaExecucao estrategiaExecucao = new ExecucaoImediata();

    // Método para adicionar um observador à agenda;
    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    // Metodo para adicionar uma tarefa à agenda;
    // Uso dos dois padrões Strategy e Observer, para notificar os observadores á
    // agenda e ordenar
    // as tarefas de acordo com a estratégia de prioridade definida;
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

    // Metoodo para executar uma tarefa, usando a estratégia de execução definida;
    public void executarTarefa(String tarefa) {
        estrategiaExecucao.executar(tarefa);
    }

    // Padrão Strategy: Permite alterar a estratégia de priorização das tarefas
    public void setPrioridadeStrategy(PrioridadeStrategy strategy) {
        this.prioridadeStrategy = strategy;
    }

    // Padrão Strategy: Permite alterar a estratégia de execução das tarefas
    public void setEstrategiaExecucao(EstrategiaExecucao estrategia) {
        this.estrategiaExecucao = estrategia;
    }

    // Método para listar todas as tarefas na agenda;
    public void listarTarefas() {
        System.out.println("Tarefas na agenda:");
        for (String tarefa : tarefas) {
            System.out.println(" - " + tarefa);
        }
    }

}
