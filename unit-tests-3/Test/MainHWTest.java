import seminars.third.hw.MainHW;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
public class MainHWTest {
    private MainHW mainHW;

    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void evenNumberReturnsTrue(int n) {
        assertTrue(mainHW.evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 15})
    void evenNumberReturnsFalse(int n) {
        assertFalse(mainHW.evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 37, 78, 99})
    void numberInRangeReturnsTrue(int n) {
        assertTrue(mainHW.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 100, 2, 120})
    void numberInRangeReturnsFalse(int n) {
        assertFalse(mainHW.numberInInterval(n));
    }
}
