package modelo.todolist;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//cria uma classe
public class Tarefa {
    private final int id;
    private static int contador;
    private final LocalDateTime data;
    private String nome;
    private String descricao;
    private Boolean concluido;

    //constructor
    public Tarefa(String nome, String descricao) {
        this.id = ++contador;
        this.data = LocalDateTime.now();
        this.nome = nome;
        this.descricao = descricao;
        this.concluido = false;
    }//inicializa um objeto

    public String getData() {
        DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return data.format(formatado);
    }//retorna a data

    public int getId(){
        return this.id;
    }//retorna o id

    public Boolean isConcluido() {
        return concluido;
    }//retorna o valor do concluído

    public void setConcluido() {
        this.concluido = true;
    }//atribui true para a variável "concluido"

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
