package optionalConvertDecimalToBinary;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CovertDecimalToBinaryTest {

    CovertDecimalToBinary convert = new CovertDecimalToBinary();

    @Test
    @DisplayName("TEST 1")
    void testChuyenSangSoNhiPhan1() {
        int number = 10;
        String expected = Integer.toBinaryString(number);
        String actual = convert.chuyenSangSoNhiPhan(number);
        assertEquals(expected,actual);
    }
}
