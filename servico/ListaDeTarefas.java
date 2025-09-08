package servico;
import java.util.ArrayList;
import modelo.Tarefa;

public class ListaDeTarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();//cria o array para guardar as tarefas

    //metodo para adicionar uma tarefa no ArrayList
    public void adicionar (String nome, String descricao){
        tarefas.add(new Tarefa(nome, descricao));
    }

    public void menu(){
        System.out.println("============ LISTA DE TAREFAS ============");
        System.out.println("1 - Adicionar Tarefa");
        System.out.println("2 - Concluir Tarefa");
        System.out.println("3 - Listar Tarefas");
        System.out.println("4 - Editar Tarefas");
        System.out.println("5 - Excluir Tarefa");
        System.out.println("0 - Sair");
        System.out.println("==========================================");
    }

    //metodo para imprimir lista
    public void listar(){
        if (tarefas.isEmpty()) {
            System.out.println("============ LISTA DE TAREFAS ============");
            System.out.println("Não há tarefas!");
            System.out.println("==========================================");
            return;
        }

        System.out.println("============ LISTA DE TAREFAS ============");
        for(Tarefa t: tarefas){
            System.out.println("Tarefa: " + t.getId());
            System.out.println("Nome: " + t.getNome());
            System.out.println("Descrição: " + t.getDescricao());
            System.out.println((t.isConcluido() ? "[X]" : "[ ]"));
            System.out.println(" ");
        }
        System.out.println("==========================================");
    }

    public Tarefa buscar(int id){
    //completar
    }

    public void editar(int id, String novoNome, String novaDescricao){
    //completar
    }

    public void excluir(int id){
    //completar
    }


} 
