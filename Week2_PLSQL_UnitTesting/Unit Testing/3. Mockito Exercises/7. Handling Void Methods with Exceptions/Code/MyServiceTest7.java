package mockito;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyServiceTest7 {
    @Test
    public void testVoidMethodThrowsException() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doThrow(new RuntimeException("Logging failed"))
            .when(mockApi).logEvent(anyString());

        MyService service = new MyService(mockApi);

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            service.log("Critical Error");
        });

        assertEquals("Logging failed", exception.getMessage());
        verify(mockApi).logEvent("Critical Error");
    }
}
