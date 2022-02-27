package workhours;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkHoursTest {

    @Test
    void minWork() {
        WorkHours workHours = new WorkHours();
        String result = workHours.minWork("src/test/resources/workhours.txt");
        System.out.println(workHours.getEmployees());
        assertEquals("John Doe: 2021-01-04", result);
    }
}