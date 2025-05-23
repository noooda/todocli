import io.github.noooda.todocli.TodoCli;
import io.github.noooda.todocli.TaskManager;


public class Main {
    public static void main(String[] args) {
        TodoCli todoCli = new TodoCli(new TaskManager());
        todoCli.run();
    } 
}
