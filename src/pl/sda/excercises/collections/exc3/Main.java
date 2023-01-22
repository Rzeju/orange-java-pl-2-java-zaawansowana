package pl.sda.excercises.collections.exc3;

import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        CommandQueueConsumer commandQueueConsumer = new CommandQueueConsumer();
        Queue<Command> queue = CommandQueueCreator.createCommandQueue();
        commandQueueConsumer.consumeCommandQueue(queue);
    }
}
