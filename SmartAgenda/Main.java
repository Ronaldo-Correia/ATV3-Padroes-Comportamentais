package SmartAgenda;

//importações de classes do padrão Comand.
import SmartAgenda.Command.Comando;
import SmartAgenda.Command.EnviarEmail;
import SmartAgenda.Command.ExecutorDeTarefas;
import SmartAgenda.Command.TocarAlarme;

//importações de classes do padrão Strategy.
import SmartAgenda.Strategy.PrioridadeAlfabetica;
import SmartAgenda.Strategy.Execucaocomconfirmacao;

//importações de classes do padrão Observer.
import SmartAgenda.observer.Logar;
import SmartAgenda.observer.NotificarUsuario;
import SmartAgenda.observer.SugestaoAcao;

public class Main {
    public static void main(String[] args) {

        // instanciando uma nova agenda;
        // Padrão Observer: adcionando observadores a agenda;
        Agenda agenda = new Agenda();
        agenda.adicionarObservador(new Logar());
        agenda.adicionarObservador(new NotificarUsuario());
        agenda.adicionarObservador(new SugestaoAcao());

        // Padrão Strategy: definindo estratégias de prioridade e execução
        // por ordem alfabética e execução com confirmação;
        agenda.setPrioridadeStrategy(new PrioridadeAlfabetica());
        agenda.setEstrategiaExecucao(new Execucaocomconfirmacao());

        // adcionando tarefas a agenda;
        agenda.adicionarTarefa("Reuniao com equipe as 10h");
        agenda.adicionarTarefa("Reuniao com equipe as 10h");
        agenda.adicionarTarefa("Almoco com cliente as 12h");
        agenda.adicionarTarefa("Enviar relatorio as 15h");

        // Padrão Strategy: executando tarefas com estratégia definida;
        agenda.executarTarefa("Enviar relatorio as 10h");

        // Padrão Command: executando comandos específicos;
        ExecutorDeTarefas executor = new ExecutorDeTarefas();
        Comando cmd1 = new EnviarEmail();
        Comando cmd2 = new TocarAlarme();

        executor.executarComando(cmd1);
        executor.executarComando(cmd2);

        // Ainda no Padrão Command: desfazendo o último comando executado;
        executor.desfazerUltimo();
    }
}
