public class Task {

    private String description;
    private boolean isDone;
    private int identifier;

    public Task(String description, int identifier) {
        if (description == null || description.trim().equals("")) {
            throw new IllegalArgumentException("Invalid task description");
        }
        this.description = description;
        this.identifier = identifier;
        this.isDone = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void modifyDescription(String description) {
        if (description == null || description.trim().equals("")) {
            throw new IllegalArgumentException("Invalid task description");
        }
        this.description = description;
    }

    public void setDone(boolean done) {
        this.isDone = done;
    }
}
