package br.com.infnet;

public class Todo {
    private static int contadorTarefas = 0;
    private final int id;
    private final String descricao;

    public Todo(String descricao) {
        this.id = ++contadorTarefas;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
