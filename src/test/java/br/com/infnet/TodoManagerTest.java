package br.com.infnet;

public class TodoManagerTest {

    @Test
    public void testAdicionarTarefa() {
        TodoManager todoManager = new TodoManager();
        todoManager.adicionarTarefa("Testar a aplicação");
        assertEquals(1, todoManager.getListaDeTarefas().size());
    }

    @Test
    public void testRemoverTarefa() {
        TodoManager todoManager = new TodoManager();
        todoManager.adicionarTarefa("Testar a aplicação");
        assertTrue(todoManager.removerTarefa(1));
        assertEquals(0, todoManager.getListaDeTarefas().size());
    }

    @Test
    public void testRemoverTarefaComListaVazia() {
        TodoManager todoManager = new TodoManager();
        assertFalse(todoManager.removerTarefa(1));
    }

    @Test
    public void testRemoverTarefaComIdInvalido() {
        TodoManager todoManager = new TodoManager();
        todoManager.adicionarTarefa("Testar a aplicação");
        assertFalse(todoManager.removerTarefa(2));
    }

    @Test
    public void testAdicionarTarefaComDescricaoNula() {
        TodoManager todoManager = new TodoManager();
        assertThrows(IllegalArgumentException.class, () -> todoManager.adicionarTarefa(null));
    }
}
