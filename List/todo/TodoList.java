import java.util.ArrayList;

public class TodoList {

    private ArrayList<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<Task>();
    }

    public void addTask(Task task) {
        for (Task t : tasks) {
            if (t.getIdentifier() == task.getIdentifier()) {
                throw new IllegalArgumentException("Task with identifier " + task.getIdentifier() + " already exists in the list");
            }
        }
        tasks.add(task);
    }

    public boolean markTaskDone(int identifier) {
        for (Task t : tasks) {
            if (t.getIdentifier() == identifier) {
                t.setDone(true);
                return true;
            }
        }
        return false;
    }

    public boolean undoTask(int identifier) {
        for (Task t : tasks) {
            if (t.getIdentifier() == identifier) {
                t.setDone(false);
                return true;
            }
        }
        return false;
    }

    public void undoAll() {
        for (Task t : tasks) {
            t.setDone(false);
        }
    }

    public void completeAll() {
        for (Task t : tasks) {
            t.setDone(true);
        }
    }

    public void listTasks() {
        for (Task t : tasks) {
            String status = t.isDone() ? "[X]" : "[ ]";
            System.out.println(status + "  Id: " + t.getIdentifier() + " - Description: " + t.getDescription());
        }
    }
}
