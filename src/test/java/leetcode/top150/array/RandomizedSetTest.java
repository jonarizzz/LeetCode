package leetcode.top150.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RandomizedSetTest {

    RandomizedSet randomizedSet;

    @BeforeEach
    public void init() {
         randomizedSet = new RandomizedSet();
    }

    @Test
    public void testOne() {
        boolean insert1 = randomizedSet.insert(1);
        boolean remove1 = randomizedSet.remove(2);
        boolean insert2 = randomizedSet.insert(2);
        int random1 = randomizedSet.getRandom();
        boolean remove2 = randomizedSet.remove(1);
        boolean insert3 = randomizedSet.insert(2);
        int random2 = randomizedSet.getRandom();

        assertThat(insert1).isTrue();
        assertThat(remove1).isFalse();
        assertThat(insert2).isTrue();
        assertThat(random1).isIn(1, 2);
        assertThat(remove2).isTrue();
        assertThat(insert3).isFalse();
        assertThat(random2).isEqualTo(2);
    }

}