package eu.dreamix.main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class MockitoSpyExampleTest {
    @Test
    public void high_shouldHaveDifferentFingers_whenMockitoSpyExampleResult_isAltered() {
        // given
        int expectedFingers = 10;
        MockitoSpyExample objectUnderTest = spy(new MockitoSpyExample());
        when(objectUnderTest.getFingers(any(Integer.class)))
                .thenReturn(expectedFingers);

        // when
        int receivedFingers = objectUnderTest.high(5);

        // then
        assertEquals(expectedFingers, receivedFingers);
    }
}
