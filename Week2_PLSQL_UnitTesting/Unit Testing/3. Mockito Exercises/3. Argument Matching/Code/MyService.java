package mockito;
public class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public void process(String input) {
        api.sendData(input);
    }

    public void log(String message) {
        api.logEvent(message);
    }

    public void callSequence() {
        api.start();
        api.process();
        api.end();
    }
}
