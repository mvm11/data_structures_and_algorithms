import two_sum.TwoSumSolution;
import two_sum_boolean.TwoSumSolutionBoolean;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Two sum exercises
        int[] numbers = {15, 7, 11, 2};
        int target = 9;
        // Two sum

        int[] twoSumSolution = TwoSumSolution.twoSum(numbers, target);
        System.out.println("Output: " + Arrays.toString(twoSumSolution));
        boolean twoSumSolutionBoolean = TwoSumSolutionBoolean.twoSum(numbers, target);
        System.out.println("Output: " + twoSumSolutionBoolean);
    }
}
