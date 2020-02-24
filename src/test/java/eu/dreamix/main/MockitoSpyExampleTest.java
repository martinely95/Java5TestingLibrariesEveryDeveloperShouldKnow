package eu.dreamix.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

class MockitoSpyExampleTest {
    @Test
    void highFive_shouldHave10Fingers_whenMockitoSpyExampleResult_isAltered() {
        // given
        int expectedTen = 10;
        MockitoSpyExample objectUnderTest = spy(new MockitoSpyExample());
        when(objectUnderTest.getFingers(any(Integer.class)))
                .thenReturn(expectedTen);

        // when
        int received10Fingers = objectUnderTest.high(5);

        // then
        assertEquals(expectedTen, received10Fingers);
    }
}
