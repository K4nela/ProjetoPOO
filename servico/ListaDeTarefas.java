package modelo;
import java.time.LocalDateTime;

//cria uma classe
public class Tarefa {
    private int id;
    private static int contador;
    private LocalDateTime data;
    private String nome;
    private String descricao;
    private Boolean concluido;

    //constructor
    public Tarefa(String nome, String descricao) {
        this.id = ++contador;
        this.data = data;
        this.nome = nome;
        this.descricao = descricao;
        this.concluido = false;
    }//inicializa um objeto

    public int getId(){
        return this.id;
    }//retorna o id
    //metodos
    public Boolean isConcluido() {
        return concluido;
    }//retorna o valor do concluído

    public Boolean setConcluido() {
        this.concluido = true;
        return true;
    }//conclui

    public void setNome(String nome) {
        this.nome = nome;
        this.concluido = false;
    }//adiciona nome

    public void setDescricao(String descricao){
        this.descricao = descricao;
        this.concluido = false;
    }//adiciona descrição

    public String getNome() {
        return nome;
    }//retorna o nome

    public String getDescricao() {
        return descricao;
    }//retorna a descrição

}
