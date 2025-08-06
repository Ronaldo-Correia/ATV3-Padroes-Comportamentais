# 🧠 SmartAgenda – Sistema de Gerenciamento de Tarefas com Padrões de Projeto (Observer e Strategy)

Este projeto é uma simulação de um sistema de agenda inteligente que utiliza os padrões de projeto **Observer** ,**Strategy** e **Command** para o gerenciamento, notificação e execução de tarefas. Ele foi desenvolvido como parte de uma atividade prática da disciplina de **Padrões de Projeto** solicitado pelo professor Felipe Silva.
Foi utilizado como linguagem de programação Java.


## 🎯 OBJETIVO

Aplicar e compreender o funcionamento dos padrões de projeto **Observer** (para notificação de eventos), **Strategy** (para ordenação e execução de tarefas) e **Command** (para encapsular as ações de execução de tarefas em objetos que implementam uma interface comum) através de uma implementação de uma agenda dinâmica de tarefas.

---

## 🏗️ ARQUITETURA DO PROJETO

O projeto é dividido nos seguintes pacotes:

SmartAgenda/

├── Command/ 

    ├── Comando.java
    ├── ExecutorDeTarefas.java 
    ├── EnviarEmail.java
    ├── TocarAlarme.java
  
├── observer/ 

    ├── Logar.java 
    ├── NotificarUsuario.java 
    ├── Observador.java
    ├── SugestãoAcao.java
  
├── Strategy/ 

    ├── EstrategiaExecucao.java 
    ├── ExecucaoAtrasada.java
    ├── ExecucaoComConfirmacao.java
    ├── ExecucaoImediata.java
    ├── PrioridadeAlfabetica.java
    ├── PrioridadeInsercao.java
    ├── PrioridadeStratey.java
    
├── Agenda.java 

├── Main.java 


---

## 📦 PADRÕES DE PROJETO UTILIZADOS

### 🔁 Observer

Permite que múltiplos objetos (observadores) sejam notificados automaticamente sempre que uma nova tarefa for adicionada à agenda.

**Interface:**
- `Observador`: define o método `notificar(String mensagem)`

**Implementações:**
- `Logar`: imprime logs da ação
- `NotificarUsuario`: simula uma notificação ao usuário
- `SugestaoAcao`: sugere ações com base na tarefa

### 🧩 Strategy

Permite alterar dinamicamente o comportamento da ordenação e execução de tarefas.

**Interfaces:**
- `PrioridadeStrategy`: define como as tarefas são ordenadas
- `EstrategiaExecucao`: define como a tarefa será executada

**Implementações:**
- `PrioridadeInsercao`: mantém ordem de inserção das tarefas
- `PrioridadeAlfabetica`: ordena tarefas em ordem alfabética
- `ExecucaoImediata`: executa a tarefa diretamente
- `ExecucaoAgendada`: simula agendamento da execução

---

### Padrão Command

O Command é um padrão de projeto comportamental que transforma um pedido em um objeto independente que contém toda a informação sobre o pedido. Essa transformação permite que você parametrize métodos com diferentes pedidos, 
atrase ou coloque a execução do pedido em uma fila, e suporte operações que não podem ser feitas

**Interfaces:**
- `Comando`: define os metodos de execução e e desfeita para as classes que a implementaram

**Implementações:**
- `EnviarEmail`:Executa o comando de envio e exclusao de envio de email
- `ExecutorDe Tarefas`: Execução e desfeita de tarefas e lista com todas tarefas
- `TocarAlarme`:Executa o comando de toque e desfeita de alarme

  

## 🧪 FUNCIONALIDADES

- ✅ Adicionar tarefas à agenda
- ✅ Notificar observadores automaticamente ao adicionar tarefas
- ✅ Permitir execução de tarefas com diferentes estratégias
- ✅ Permitir ordenação das tarefas com diferentes critérios

---

## 🧠 CONHECIMENTOS APLICADOS
Padrões de Projeto GoF

Programação Orientada a Objetos

Encapsulamento de Comportamentos

Inversão de Controle (IoC)

Flexibilidade e extensibilidade de sistemas

## 👨‍💻 AUTORES
- Marcelo de Jesus
- Ronaldo Correia
[IFBA-Instituto Federal da Bahia]
– Orientador(a) Felipe Silva

## 🚀 COMO EXECUTAR

1. **Clone o repositório:**
   
1. 1- git clone [ https://github.com/seu-usuario/SmartAgenda.git](https://github.com/Ronaldo-Correia/ATV3-Padroes-Comportamentais.git)
    cd SmartAgenda
2. 2- Navegue até o diretório do projeto:
cd ATV3-Padroes-Comportamentais

3- Execute o programa no arquivo 'main.java' ao clicar no botao "Run" na sua IDEA.


## 📝 OBSERVAÇÕES FINAIS

O projeto SmartAgenda foi uma importante oportunidade para consolidar conceitos fundamentais de Padrões de Projeto, aplicando três dos principais padrões do catálogo GoF: Strategy, Observer e Command.
Durante o desenvolvimento do projeto, foram assimilados diversos conceitos valiosos como, princípios SOLID, melhor compreensão da separação de responsabilidades entre as classes e pacotes, prática com encapsulamento de comportamentos e programação orientada a interfaces e
importância de tornar o código flexível, escalável e de fácil manutenção.
Portanto, esse projeto simula um ambiente próximo ao mundo real onde mudanças de requisitos são comuns. Ao empregar padrões de projeto de forma estratégica, foi possível obter uma solução mais robusta, reutilizável e preparada para futuras evoluções.






