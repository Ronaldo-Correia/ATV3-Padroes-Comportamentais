package SmartAgenda.Strategy;

import java.util.Collections;
import java.util.List;

public class PrioridadeAlfabetica implements PrioridadeStrategy {

    @Override
    public void ordenar(List<String> tarefas) {
        Collections.sort(tarefas);
    }
}
