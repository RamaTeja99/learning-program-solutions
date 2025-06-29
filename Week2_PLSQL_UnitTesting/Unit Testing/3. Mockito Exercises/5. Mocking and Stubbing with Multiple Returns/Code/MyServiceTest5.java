package mockito;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyServiceTest5 {
    @Test
    public void testMultipleReturns() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData())
            .thenReturn("First")
            .thenReturn("Second")
            .thenReturn("Third");

        MyService service = new MyService(mockApi);

        assertEquals("First", service.fetchData());
        assertEquals("Second", service.fetchData());
        assertEquals("Third", service.fetchData());
    }
}

