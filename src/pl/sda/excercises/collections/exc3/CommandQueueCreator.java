package pl.sda.excercises.collections.exc3;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CommandQueueCreator {

    public static Queue<Command> createCommandQueue() {
        Queue<Command> queue = new LinkedList<>();

        Command command_1 = new Command("Command 1");
        Command command_2 = new Command("Command 2");
        Command command_3 = new Command("Command 3");
        Command command_4 = new Command("Command 4");

        queue.add(command_1);
        queue.add(command_2);
        queue.add(command_3);
        queue.add(command_4);

        return queue;
    }
}
