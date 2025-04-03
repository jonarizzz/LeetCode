package leetcode.top150.array;

import java.util.Arrays;

public class Candy {

    // There are n children standing in a line. Each child is assigned a rating
    // value given in the integer array ratings.
    //
    // You are giving candies to these children subjected to the following requirements:
    //
    // 1. Each child must have at least one candy.
    // 2. Children with a higher rating get more candies than their neighbors.
    // 3. Return the minimum number of candies you need to have to distribute the
    //    candies to the children.

    // Example 1:
    //
    // Input: ratings = [1,0,2]
    // Output: 5
    // Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies
    // respectively.

    // Example 2:
    //
    // Input: ratings = [1,2,2]
    // Output: 4
    // Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies
    // respectively.
    // The third child gets 1 candy because it satisfies the above two conditions.

    // Constraints:
    //
    // n == ratings.length
    // 1 <= n <= 2 * 104
    // 0 <= ratings[i] <= 2 * 104

    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];

        // 1. Сначала даем всем по 1 конфете
        Arrays.fill(candies, 1);

        // 2. Проход слева-направо: если справа рейтинг выше, даем на 1 больше
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // 3. Проход справа-налево: если слева рейтинг выше, но конфет меньше или равно,
        // корректируем: правое кол-во + 1 или текущее кол-во, если оно больше, чем правое + 1
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // 4. Считаем сумму конфет
        int total = 0;
        for (int c : candies) {
            total += c;
        }

        return total;
    }

}
