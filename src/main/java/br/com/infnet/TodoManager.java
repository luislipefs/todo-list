package br.com.infnet;
import java.util.ArrayList;

public class TodoManager {
    private ArrayList<Todo> listaDeTarefas = new ArrayList<>();
    private InputReader inputReader = new InputReader();

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("=== Aplicação de Lista de Tarefas ===");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Ver Tarefas");
            System.out.println("3. Remover Tarefa");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = inputReader.lerInteiro();

            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    verTarefas();
                    break;
                case 3:
                    removerTarefa();
                    break;
                // Adicione mais casos conforme necessário
            }
        } while (opcao != 0);
    }

    private void adicionarTarefa() {
        System.out.print("Digite a tarefa: ");
        String descricao = inputReader.lerString();
        Todo novaTarefa = new Todo(descricao);
        listaDeTarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    private void verTarefas() {
        if (listaDeTarefas.isEmpty()) {
            System.out.println("A lista de tarefas está vazia.");
        } else {
            System.out.println("=== Tarefas ===");
            for (int i = 0; i < listaDeTarefas.size(); i++) {
                System.out.println((i + 1) + ". " + listaDeTarefas.get(i).getDescricao());
            }
        }
    }

    private void removerTarefa() {
        if (listaDeTarefas.isEmpty()) {
            System.out.println("A lista de tarefas está vazia. Não há tarefas para remover.");
            return;
        }

        System.out.print("Digite o número da tarefa que deseja remover: ");
        int numeroTarefa = inputReader.lerInteiro();

        if (numeroTarefa >= 1 && numeroTarefa <= listaDeTarefas.size()) {
            listaDeTarefas.remove(numeroTarefa - 1);
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Número de tarefa inválido. Tente novamente.");
        }
    }
}