package leetcode.top150.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GasStationTest {

    public GasStation gasStation;

    @BeforeEach
    public void init() {
        gasStation = new GasStation();
    }


    @Test
    public void testOne() {

        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int expected = 3;

        int actual = gasStation.canCompleteCircuit(gas, cost);

        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void testTwo() {

        int[] gas = {2,3,4};
        int[] cost = {3,4,3};
        int expected = -1;

        int actual = gasStation.canCompleteCircuit(gas, cost);

        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void testThree() {

        int[] gas = {6,1,4,3,5};
        int[] cost = {3,8,2,4,2};
        int expected = 2;

        int actual = gasStation.canCompleteCircuit(gas, cost);

        assertThat(actual).isEqualTo(expected);

    }

}