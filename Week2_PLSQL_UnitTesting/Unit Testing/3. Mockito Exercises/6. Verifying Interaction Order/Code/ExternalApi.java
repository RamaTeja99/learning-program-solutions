package mockito;

public interface ExternalApi {
	 String getData();
	    void sendData(String data);
	    void logEvent(String message);
	    void start();
	    void process();
	    void end();
}
