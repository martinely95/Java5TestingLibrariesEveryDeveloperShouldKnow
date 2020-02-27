package eu.dreamix.main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitExampleTest {
    @Test
    public void multiply_shouldReturnWrongResult_whenMultiplicand_isCorrect() {
        // given
        JUnitExample objectUnderTest = new JUnitExample();

        // when
        int result = objectUnderTest.multiply(2);

        // then
        assertEquals(10, result);
    }
}
