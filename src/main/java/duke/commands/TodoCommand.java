package duke.commands;

import duke.DateTimeHandler;
import duke.Storage;
import duke.TaskList;
import duke.Todo;
import duke.UI;

public class TodoCommand extends Command {

    public TodoCommand(String arguments) {
        super(arguments);
    }

    @Override
    public Command of(String arguments) {
        return new TodoCommand(arguments);
    }

    @Override
    public void execute(TaskList tl, Storage s, UI ui, DateTimeHandler dth) {
        String args = super.getArguments();
        if (args.length() == 0) {
            ui.print("Please enter the name of the task after todo");
            return;
        }
        Todo t = new Todo(args, false);
        tl.addToList(t);
        ui.print(tl.taskAddedMessage(t));
    }

    @Override
    public String startsWith() {
        return "todo";
    }
}
