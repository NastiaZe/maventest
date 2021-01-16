import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusMilesServiceTest {

    @Test
    void shouldcalculateRegisteredAndUnderLimit() {
        BonusMilesService service = new BonusMilesService();
        long amount = 1000_60;
        boolean registered = false;
        long expected;
        expected = 10;
        long actual = service.calculate(amount,registered);
        assertEquals(expected, actual);
    }
    @Test
    void shouldcalculateRegisteredAndOverLimit() {
        BonusMilesService service = new BonusMilesService();
        long amount = 26000_60;
        boolean registered = false;
        long expected;
        expected = 260;
        long actual = service.calculate(amount,registered);
        assertEquals(expected, actual);
    }
    @Test
    void shouldcalculateRegisteredAndLimit() {
        BonusMilesService service = new BonusMilesService();
        long amount = 1000_60;
        boolean registered = true;
        long expected;
        expected = 30;
        long actual = service.calculate(amount,registered);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredAndOverlimit() {
        BonusMilesService service = new BonusMilesService();
        long amount = 1_000_000_60;
        boolean registered = false;
        long expected;
        expected = 500;
        long actual = service.calculate(amount,registered);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForRegisteredAndOverlimit() {
        BonusMilesService service = new BonusMilesService();
        long amount = 10000_60;
        boolean registered = false;
        long expected;
        expected = 100;
        long actual = service.calculate(amount,registered);
        assertEquals(expected, actual);
    }

}
