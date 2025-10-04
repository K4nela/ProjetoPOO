package todolist;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        ListaDeTarefas lista = new ListaDeTarefas();//armazena as tarefas.
        char opcao;

        do{//sempre vai aparecer o menu.

            lista.menu();

            System.out.print("\nDigite a opção: ");
            opcao = scan.next().charAt(0);
            scan.nextLine();

            switch (opcao){
                case '1'://cria uma tarefa
                        System.out.print("\nNome da Tarefa: ");
                        String nome = scan.nextLine();

                        System.out.print("\nDescrição: ");
                        String descricao = scan.nextLine();

                        lista.adicionar(nome,descricao);
                        break;

                case '2'://conclui uma tarefa
                        lista.listar();
                        System.out.print("\nDigite o numero da tarefa que deseja concluir.\nNum: ");

                        int num_concluir = scan.nextInt();
                        scan.nextLine();

                        lista.concluir(num_concluir);
                        break;

                case '3'://lista as tarefas.
                        lista.listar();
                        break;

                case '4'://edita tarefa.
                        lista.listar();
                        System.out.print("\nDigite o numero da tarefa que deseja editar.\nNum: ");
                        int num_editar = scan.nextInt();
                        scan.nextLine();

                        System.out.print("Digite o novo nome: ");
                        String novoNome = scan.nextLine();

                        System.out.print("Digite a nova descrição: ");
                        String novaDescricao = scan.nextLine();

                        lista.editar(num_editar,novoNome,novaDescricao);
                        lista.listar();
                        break;

                case '5'://exclui tarefa.
                        lista.listar();
                        System.out.print("\nDigite o numero da tarefa que deseja excluir.\nNum: ");
                        int num_excluir = scan.nextInt();
                        scan.nextLine();
                        lista.excluir(num_excluir);
                        break;
            }
        }while(opcao != '0');//opcao de saida do loop.

    }
}
