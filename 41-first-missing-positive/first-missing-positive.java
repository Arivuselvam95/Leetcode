import java.util.HashSet;
import java.util.Set;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int ans = 1;
        while (set.contains(ans)) {
            ans++;
        }
        return ans;
    }
}
