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
         for(Tarefa t: tarefas){
            if (t.getId() == id){
                return t;
            }
        }
        return null;
    }

    public void editar(int id, String novoNome, String novaDescricao){
        Tarefa id_editar = buscar(id);
        if(id_editar != null){
            id_editar.setNome(novoNome);
            id_editar.setDescricao(novaDescricao);
            System.out.println("Tarefa editada com sucesso!");
        }else{
            System.out.println("ERRO! Tarefa não encontrada!");
        }
    }

    public void excluir(int id){
        Tarefa id_excluir = buscar(id);
        if(id_excluir != null){
            tarefas.remove(id_excluir);//remove tarefa usando id
            System.out.println("Tarefa excluída com sucesso!");
        }else{
            System.out.println("ERRO! Tarefa não encontrada!");

    }
} 
