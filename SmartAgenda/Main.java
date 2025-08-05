package SmartAgenda;

import SmartAgenda.Command.Comando;
import SmartAgenda.Command.EnviarEmail;
import SmartAgenda.Command.ExecutorDeTarefas;
import SmartAgenda.Command.TocarAlarme;
import SmartAgenda.Strategy.PrioridadeAlfabetica;
import SmartAgenda.observer.Logar;
import SmartAgenda.observer.NotificarUsuario;
import SmartAgenda.observer.SugestaoAcao;
import SmartAgenda.Strategy.Execucaocomconfirmacao;

public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        agenda.adicionarObservador(new Logar());
        agenda.adicionarObservador(new NotificarUsuario());
        agenda.adicionarObservador(new SugestaoAcao());

        agenda.setPrioridadeStrategy(new PrioridadeAlfabetica());
        agenda.setEstrategiaExecucao(new Execucaocomconfirmacao());

        agenda.adicionarTarefa("Reuniao com equipe as 10h");
        agenda.adicionarTarefa("Reuniao com equipe as 10h");
        agenda.adicionarTarefa("Almoco com cliente as 12h");
        agenda.adicionarTarefa("Enviar relatorio as 15h");
        agenda.executarTarefa("Enviar relatorio as 10h");

        ExecutorDeTarefas executor = new ExecutorDeTarefas();
        Comando cmd1 = new EnviarEmail();
        Comando cmd2 = new TocarAlarme();

        executor.executarComando(cmd1);
        executor.executarComando(cmd2);

        executor.desfazerUltimo();
    }
}
