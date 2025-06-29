package mockito;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
public class MyServiceTest4 {
	  @Test
	    public void testVoidMethod() {
	        ExternalApi mockApi = mock(ExternalApi.class);
	        doNothing().when(mockApi).logEvent(anyString());

	        MyService service = new MyService(mockApi);
	        service.log("Event occurred");

	        verify(mockApi).logEvent("Event occurred");
	    }
}
