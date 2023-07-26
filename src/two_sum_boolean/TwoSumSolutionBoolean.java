package two_sum_boolean;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoSumSolutionBoolean {

    private TwoSumSolutionBoolean(){}

    public static boolean twoSum(int[] nums, int target) {

        Map<Integer, Integer> complements = new HashMap<>();

        return IntStream.range(0, nums.length)
                .filter(index -> {
                    int complement = target - nums[index];
                    complements.putIfAbsent(nums[index], index);
                    return complements.containsKey(complement) && complements.get(complement) != index;
                })
                .mapToObj(index -> true)
                .findFirst()
                .orElse(false);
    }
}
