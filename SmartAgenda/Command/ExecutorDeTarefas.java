package SmartAgenda.Command;

import java.util.List;
import java.util.ArrayList;

public class ExecutorDeTarefas {
    private List<Comando> comandos = new ArrayList<>();
      
    public void executarComando(Comando comando) {
        comandos.add(comando);
        comando.executar();
    }
    public void desfazerUltimo() {
        if (!comandos.isEmpty()) {
            Comando ultimoComando = comandos.remove(comandos.size() - 1);
            ultimoComando.desfazer();
            
        }
    }

}
