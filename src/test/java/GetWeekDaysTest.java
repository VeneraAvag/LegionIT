import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GetWeekDaysTest {
    public String getDay(Integer dayNumber) {
        ArrayList<String> daysList = new ArrayList();
        daysList.add("Sunday");
        daysList.add("Monday");
        daysList.add("Tuesday");
        daysList.add("Wednesday");
        daysList.add("Thursday");
        daysList.add("Friday");
        daysList.add("Saturday");

        if (dayNumber == null) {
            throw new NullPointerException();
        } else if (dayNumber < 1) {
            return "The number should be equal or larger than 1";
        } else if (dayNumber > 7) {
            return "The number should be equal or smaller than 7";
        } else {
            return daysList.get(dayNumber - 1);
        }
    }

    @ParameterizedTest
    @CsvSource({"1, Sunday", "2, Monday", "3, Tuesday", "4, Wednesday", "5, Thursday", "6, Friday", "7, Saturday"})
    public void positiveWeekDaysTest(int dayNumber, String weekDay) {
        String expectedResult = weekDay;
        String actualResult = getDay(dayNumber);

        assertEquals(expectedResult, actualResult, "Return incorrect day of week");
    }

    @ParameterizedTest
    @ValueSource(ints = {-120, -2, -1, 0})
    public void negativeWeekDaysTest(int weekDay) {
        String expectedResult = "The number should be equal or larger than 1";
        String actualResult = getDay(weekDay);
        assertEquals(expectedResult, actualResult);

        assertFalse(weekDay > 0, "The number should be equal or larger than 1");
    }

    @ParameterizedTest
    @ValueSource(ints = {8, 9, 120})
    public void outOfBoundaryDaysTest(int weekDay) {
        String expectedResult = "The number should be equal or smaller than 7";
        String actualResult = getDay(weekDay);
        assertEquals(expectedResult, actualResult);

        assertFalse(weekDay < 8, "The number should be equal or smaller than 7");
    }

    @Test
    @DisplayName("Null pointer exception test")
    public void errorTest() {
        assertThrows(NullPointerException.class, () -> {
            getDay(null);
        });
    }
}
