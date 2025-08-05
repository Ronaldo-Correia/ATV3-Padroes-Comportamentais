package SmartAgenda.Strategy;

import java.util.List;

public interface PrioridadeStrategy {
    void ordenar(List<String> tarefas);

    // Não altera a lista, mantém a ordem original de inserção.

}
