package pl.sda.excercises.collections.exc3;

public class Command {

    private String command;

    public Command(String command) {
        this.command = command;
    }

    public void operation() {
        System.out.println(command);
    }
}
