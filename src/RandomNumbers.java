import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

/**
 * Author: artyom_aroyan
 * Date: 10.07.25
 * Time: 02:47:09
 */
public class RandomNumbers {
    private static final Random RANDOM = new Random();
    private static final Logger logger = Logger.getLogger(RandomNumbers.class.getName());

    public static void main(String[] args) {

        generateRandomIntNumber();
        generateRandomDoubleNumber();
    }

    private static void generateRandomDoubleNumber() {
        // Generate between 15 and 30 random numbers
        int count = RANDOM.nextInt(15) + 16;

        // Stores both Integers and Doubles
        List<Number> numbers = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            if (RANDOM.nextBoolean()) { // 50% chance for int, 50% for double
                numbers.add(RANDOM.nextInt(101)); // Integer (0-100)
            } else {
                numbers.add(Math.round(RANDOM.nextDouble() * 100 * 100.0) / 100.0); // Double (0.0-100.0, 2 decimal places)
            }
        }
        logger.log(INFO, () -> "Generated " + count + " mixed random numbers: " + numbers);
    }

    private static void generateRandomIntNumber() {
        // Generate between 10 and 30 random numbers
        int count = RANDOM.nextInt(10) + 21;

        // Generate random integers (0-100)
        int[] numbers = RANDOM.ints(count, 0, 101).toArray();

        logger.log(INFO, () -> "Generated " + count + " random integers: " + Arrays.toString(numbers));
    }
}