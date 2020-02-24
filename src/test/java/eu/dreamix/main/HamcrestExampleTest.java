package eu.dreamix.main;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class HamcrestExampleTest {
    @Test
    void makeMillions_shouldNotBecomeNegative_whenPositiveValue_isPassed() {
        // given
        HamcrestExample objectUnderTest = new HamcrestExample();

        // when
        int millions = objectUnderTest.makeMillions(5);

        // then
        assertThat(millions, is(not(lessThan(0))));
    }
}
