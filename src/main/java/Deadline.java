public class Deadline extends Task{
    private String deadlineDate;

    public Deadline(String description, Boolean completionStatus, String deadlineDate) {
        super(description, completionStatus);
        this.deadlineDate = deadlineDate;
    }

    @Override
    public String typeIcon() {
        return "[D]";
    }

    @Override
    public String toString() {
        return super.toString() + " (by: " + deadlineDate + ")";
    }
}
