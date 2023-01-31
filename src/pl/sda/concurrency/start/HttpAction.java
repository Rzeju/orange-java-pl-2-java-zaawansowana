package pl.sda.concurrency.start;

public class HttpAction extends Thread {

    @Override
    public void run() {
        System.out.println("Wykonywanie wątka " + this.getName());
    }

}
