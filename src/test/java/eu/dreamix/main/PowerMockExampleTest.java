package eu.dreamix.main;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest({PowerMockExample.class})
public class PowerMockExampleTest {

    @Test
    public void staticMethodThatWeWillMock_shouldReturnDifferentValue_whenReturnValue_isPowerMocked() {
        // given
        PowerMockito.mockStatic(PowerMockExample.class);
        PowerMockito.when(PowerMockExample.staticMethodThatWeWillMock())
                .thenReturn(200);

        // when
        int actualResult = PowerMockExample.staticMethodThatWeWillMock();

        // then
        assertEquals(200, actualResult);
    }

    @Test
    public void staticMethodThatWeWillMock_shouldReturnProperValue_whenReturnValue_isNotPowerMocked() {
        assertEquals(5, PowerMockExample.staticMethodThatWeWillMock());
    }
}