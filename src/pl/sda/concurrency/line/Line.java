package pl.sda.concurrency.line;

public class Line {

    public void getLine(int lineNumber, int trainId) {
        System.out.printf("Train %d awaits for line %d\n", trainId, lineNumber);
        synchronized (this) {
            System.out.printf("Block %d by %d\n", lineNumber, trainId);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Line available");
        }
    }
}
