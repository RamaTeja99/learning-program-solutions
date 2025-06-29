package mockito;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;
import org.junit.jupiter.api.Test;
public class MyServiceTest3 {
	  @Test
	    public void testArgumentMatching() {
	        ExternalApi mockApi = mock(ExternalApi.class);
	        MyService service = new MyService(mockApi);

	        service.process("input");

	        verify(mockApi).sendData(eq("input"));
	    }
}
