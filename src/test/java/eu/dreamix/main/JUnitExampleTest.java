package eu.dreamix.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JUnitExampleTest {
    @Test
    void multiply_shouldReturn10_whenA_is2() {
        // given
        JUnitExample objectUnderTest = new JUnitExample();

        // when
        int result = objectUnderTest.multiply(2);

        // then
        assertEquals(10, result);
    }
}
