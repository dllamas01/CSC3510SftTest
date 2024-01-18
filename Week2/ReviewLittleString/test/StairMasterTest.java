import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StairMasterTest {

    @Test
    void testStairMaster_NIs2_returns_2() {
        //Arrange
        int n = 2;
        StairMaster sm = new StairMaster(n);
        //Act
        ArrayList<Integer> expectedSteps = new ArrayList<>(Arrays.asList(2));
        ArrayList<Integer> steps = sm.getSteps();
        //Assert
        assertEquals(expectedSteps, steps);
    }
}