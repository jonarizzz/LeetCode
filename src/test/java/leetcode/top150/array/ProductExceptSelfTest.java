package leetcode.top150.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ProductExceptSelfTest {

    public ProductExceptSelf productExceptSelf;

    @BeforeEach
    public void init() {
        productExceptSelf = new ProductExceptSelf();
    }

    @Test
    public void testOne() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};

        int[] actual = productExceptSelf.productExceptSelf(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testTwo() {
        int[] input = {-1,1,0,-3,3};
        int[] expected = {0,0,9,0,0};

        int[] actual = productExceptSelf.productExceptSelf(input);

        assertThat(actual).isEqualTo(expected);
    }

}