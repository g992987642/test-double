package mock.mokito;


import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;


@ExtendWith(MockitoExtension.class)
public class SecurityCenterMockitoTest {
    @Mock
    private DoorPanel mockDoorPanel;
    @InjectMocks
    private SecurityCenter mockSecurityCenter;

    @Test
    public void shouldVerifyDoorIsClosed() {
        mockSecurityCenter.switchOn();
        verify(mockDoorPanel, times(1)).close();
    }

}
