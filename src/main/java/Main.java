import io.github.noooda.todocli.TodoCli;
import io.github.noooda.todocli.TaskManager;
import io.github.noooda.todocli.Renderer;

public class Main {
    public static void main(String[] args) {
        TodoCli todoCli = createTodoCli();
        todoCli.run();
    }

    private static TodoCli createTodoCli() {
        TaskManager taskManager = new TaskManager();
        Renderer renderer = new Renderer();
        return new TodoCli(taskManager, renderer);
    }
}
