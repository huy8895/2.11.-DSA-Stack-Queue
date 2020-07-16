package optionalCheckBracket;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckBracketTest {
    CheckBracket checkBracket;
    @Test
    @DisplayName("Test 1")
    void isOK1() {
        checkBracket = new CheckBracket("s * (s – a) * (s – b) * (s – c)  ");
        assertTrue(checkBracket.isOK());
    }
    @Test
    @DisplayName("Test 2")
    void isOK2() {
        checkBracket = new CheckBracket("(– b + (b2 – 4*a*c)^0.5) / 2*a ");
        assertTrue(checkBracket.isOK());
    }
    @Test
    @DisplayName("Test 3")
    void isOK3() {
        checkBracket = new CheckBracket("s * (s – a) * (s – b * (s – c) ");
        assertFalse(checkBracket.isOK());
    }
    @Test
    @DisplayName("Test 4")
    void isOK4() {
        checkBracket = new CheckBracket("s * (s – a) * s – b) * (s – c)");
        assertFalse(checkBracket.isOK());
    }
    @Test
    @DisplayName("Test 5")
    void isOK5() {
        checkBracket = new CheckBracket("(– b + (b^2 – 4*a*c)^(0.5/ 2*a)) ");
        assertTrue(checkBracket.isOK());
    }
}