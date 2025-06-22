import java.util.ArrayList;
import java.util.Scanner;

public class tarefa {
    private static ArrayList<String> lista = new ArrayList<>();

    public static void adicionarTarefa(Scanner scanner) {
        boolean adicionando = true;

        while (adicionando) {
            System.out.print("Digite a tarefa: ");
            String novaTarefa = scanner.nextLine().trim();

            if (novaTarefa.isEmpty()) {
                System.out.println("Tarefa vazia! Tente novamente.");
                continue;
            }

            lista.add(novaTarefa);
            System.out.print("Deseja adicionar mais tarefas? (sim/nao): ");
            String escolha = scanner.nextLine();
            if (escolha.equalsIgnoreCase("nao")) {
                adicionando = false;
            }
        }
    }

    public static void listarTarefas() {
        System.out.println("==== LISTA DE TAREFAS ====");
        if (lista.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println((i + 1) + " - " + lista.get(i));
            }
        }
    }

    public static void removerTarefa(Scanner scanner) {
        if (lista.isEmpty()) {
            System.out.println("LISTA VAZIA");
            return;
        }

        listarTarefas();
        System.out.print("Digite o número da tarefa a remover: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index > 0 && index <= lista.size()) {
            String removida = lista.remove(index - 1);
            System.out.println("Tarefa removida: " + removida);
        } else {
            System.out.println("Número inválido.");
        }
    }

    public static void marcarConcluida(Scanner scanner) {
        if (lista.isEmpty()) {
            System.out.println("LISTA VAZIA");
            return;
        }

        listarTarefas();
        System.out.print("Digite o número da tarefa a concluir: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index > 0 && index <= lista.size()) {
            String tarefaAtual = lista.get(index - 1);
            if (tarefaAtual.endsWith(" (CONCLUÍDO)")) {
                System.out.println("Tarefa já está concluída!");
            } else {
                lista.set(index - 1, tarefaAtual + " (CONCLUÍDO)");
                System.out.println("Tarefa marcada como concluída!");
            }
        } else {
            System.out.println("Número inválido.");
        }
    }
}
