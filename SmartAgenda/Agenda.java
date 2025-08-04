package SmartAgenda;

import java.util.ArrayList;
import java.util.List;

import SmartAgenda.observer.Observador;

public class Agenda {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    public void adicionarTarefa(String tarefa) {
        System.out.println("Tarefa adicionada: " + tarefa);
        notificarTodos("Nova tarefa: " + tarefa);
    }

    private void notificarTodos(String mensagem) {
        for (Observador o : observadores) {
            o.notificar(mensagem);
        }
    }
}
