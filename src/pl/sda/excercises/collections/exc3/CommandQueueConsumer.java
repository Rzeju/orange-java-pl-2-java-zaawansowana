package pl.sda.excercises.collections.exc3;

import java.util.Queue;

public class CommandQueueConsumer {

    public void consumeCommandQueue(Queue<Command> queue) {
        while(!queue.isEmpty()) {
            queue.poll().operation();
        }
    }
}
