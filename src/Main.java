import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tarefa> Tarefas = new ArrayList<>();

        while (true) {
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefa");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Marcar como concluída");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção:");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da tarefa: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a descrição da tarefa: ");
                    String descricao = sc.nextLine();
                    Tarefas.add(new Tarefa(nome, descricao));
                    break;

                case 2:
                    for (Tarefa tarefa : Tarefas) {
                        System.out.println(tarefa);
                    }
                    break;

                case 3:
                    System.out.println("Digite o ID da tarefa para remover: ");
                    int idRemover = sc.nextInt();
                    boolean tarefaRemovida = false;

                    for (int i = 0; i < Tarefas.size(); i++) {
                        if (Tarefas.get(i).getId() == idRemover) {
                            Tarefas.remove(i);
                            tarefaRemovida = true;
                            System.out.println("Tarefa removida com sucesso!");
                            break;
                        }
                    }

                    if (!tarefaRemovida) {
                        System.out.println("ID de tarefa inválido.");
                    }
                    break;

                case 4:
                    System.out.println("Digite o ID da tarefa para marcar como concluída: ");
                    int idCheck = sc.nextInt();
                    boolean tarefaConcluida = false;

                    for (Tarefa tarefa : Tarefas) {
                        if (tarefa.getId() == idCheck) {
                            tarefa.markStatus();
                            tarefaConcluida = true;
                            System.out.println("Tarefa marcada com sucesso!");
                            break;
                        }
                    }

                    if (!tarefaConcluida) {
                        System.out.println("ID de tarefa inválido.");
                    }
                    break;

                case 5:
                    System.out.println("Fechando...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
