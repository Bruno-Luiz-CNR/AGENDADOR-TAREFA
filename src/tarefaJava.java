import java.util.Scanner;

public class tarefaJava {
    public static void main(String[] args) {
        int escOpcao;
        Scanner opcaoMenu = new Scanner(System.in);

        do {
            System.out.println("-".repeat(26));
            System.out.println("MENU PRINCIPAL TAREFA JAVA");
            System.out.println("-".repeat(26));
            System.out.println("-".repeat(36));
            System.out.println("1 - Adicionar uma nova tarefa");
            System.out.println("2 - Listar todas as tarefas");
            System.out.println("3 - Marcar uma tarefa como concluída");
            System.out.println("4 - Remover uma tarefa");
            System.out.println("5 - Sair");
            System.out.println("-".repeat(36));
            System.out.print("Digite uma opção: ");

            while (!opcaoMenu.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                opcaoMenu.next();
            }

            escOpcao = opcaoMenu.nextInt();
            opcaoMenu.nextLine();

            switch (escOpcao) {
                case 1 -> tarefa.adicionarTarefa(opcaoMenu);
                case 2 -> tarefa.listarTarefas();
                case 3 -> tarefa.marcarConcluida(opcaoMenu);
                case 4 -> tarefa.removerTarefa(opcaoMenu);
                case 5 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }

        } while (escOpcao != 5);

        opcaoMenu.close();
    }
}
