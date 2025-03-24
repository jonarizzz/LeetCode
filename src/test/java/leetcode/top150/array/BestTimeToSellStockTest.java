package leetcode.top150.array;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class BestTimeToSellStockTest {

    @Autowired
    public BestTimeToSellStock bestTimeToSellStock;

    @Test
    public void setBestTimeToSellStockTestOne() {
        int[] input = {7,1,5,3,6,4};
        int expected = 5;

        int actual = bestTimeToSellStock.maxProfit(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void setBestTimeToSellStockTestTwo() {
        int[] input = {7,6,4,3,1};
        int expected = 0;

        int actual = bestTimeToSellStock.maxProfit(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void setBestTimeToSellStockTestThree() {
        int[] input = {2,4,1};
        int expected = 2;

        int actual = bestTimeToSellStock.maxProfit(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void setBestTimeToSellStockTwoTestOne() {
        int[] input = {7,1,5,3,6,4};
        int expected = 7;

        int actual = bestTimeToSellStock.maxProfitTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void setBestTimeToSellStockTwoTestTwo() {
        int[] input = {1,2,3,4,5};
        int expected = 4;

        int actual = bestTimeToSellStock.maxProfitTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void setBestTimeToSellStockTwoTestThree() {
        int[] input = {7,6,4,3,1};
        int expected = 0;

        int actual = bestTimeToSellStock.maxProfitTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void setBestTimeToSellStockTwoTestFour() {
        int[] input = {2,1,2,0,1};
        int expected = 2;

        int actual = bestTimeToSellStock.maxProfitTwo(input);

        assertThat(actual).isEqualTo(expected);
    }
}