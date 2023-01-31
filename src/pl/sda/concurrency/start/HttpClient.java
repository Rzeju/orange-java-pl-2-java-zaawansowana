package pl.sda.concurrency.start;

public class HttpClient {

    public static void main(String[] args) {

        HttpAction httpAction = new HttpAction();
        httpAction.start();


    }
}
