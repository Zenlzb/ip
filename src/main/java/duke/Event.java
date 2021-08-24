package duke;

import java.time.LocalDateTime;

public class Event extends Task {
    private LocalDateTime startDate;
    public Event(String description, Boolean completionStatus, LocalDateTime startDate) {
        super(description, completionStatus);
        this.startDate = startDate;
    }

    @Override
    public String typeIcon() {
        return "[E]";
    }

    @Override
    public String toString() {
        return super.toString() + " (at: " + startDate + ")";
    }
}
