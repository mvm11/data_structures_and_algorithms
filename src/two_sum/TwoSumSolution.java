package two_sum;

import java.util.*;
import java.util.stream.*;

public class TwoSumSolution {

    private TwoSumSolution(){}
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> complements = new HashMap<>();

        return IntStream.range(0, nums.length)
                .filter(index -> getComplementPredicate(nums, target, complements, index))
                .mapToObj(index -> new int[]{complements.get(target - nums[index]),index})
                .findFirst()
                .orElse(new int[]{});

    }

    private static boolean getComplementPredicate(int[] nums, int target, Map<Integer, Integer> complements, int index) {
        int complement = target - nums[index];
        complements.putIfAbsent(nums[index], index);
        return complements.containsKey(complement) && complements.get(complement) != index;
    }

}
