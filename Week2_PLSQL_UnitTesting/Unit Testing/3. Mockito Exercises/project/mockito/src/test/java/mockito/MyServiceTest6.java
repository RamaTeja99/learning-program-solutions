package mockito;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class MyServiceTest6 {
    @Test
    public void testInteractionOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.callSequence();

        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).start();
        inOrder.verify(mockApi).process();
        inOrder.verify(mockApi).end();
    }
}
