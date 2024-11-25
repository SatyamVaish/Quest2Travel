import com.weddingplanner.model.Client;
import com.weddingplanner.repository.ClientRepo;
import com.weddingplanner.service.ClientSrvc;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ClientServiceTest {

    @Mock
    private ClientRepo clientRepository;

    @InjectMocks
    private ClientSrvc clientSrvc;

    @Test
    public void testCreateClient() {
        Client client = new Client();
        client.setName("John Doe");
        client.setBudget(5000);

        Mockito.when(clientRepository.save(client)).thenReturn(client);

        Client createdClient = clientSrvc.createClient(client);
        assertNotNull(createdClient);
    }
}
