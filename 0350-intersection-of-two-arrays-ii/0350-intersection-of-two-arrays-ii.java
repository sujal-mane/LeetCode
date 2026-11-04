
import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> li = new ArrayList<>();

        Map<Integer, Integer> mp1 = new HashMap<>();
        Map<Integer, Integer> mp2 = new HashMap<>();

        // Count frequency of nums1
        for (int ele : nums1) {
            if (!mp1.containsKey(ele)) {
                mp1.put(ele, 1);
            } else {
                mp1.put(ele, mp1.get(ele) + 1);
            }
        }

        // Count frequency of nums2
        for (int ele : nums2) {
            if (!mp2.containsKey(ele)) {
                mp2.put(ele, 1);
            } else {
                mp2.put(ele, mp2.get(ele) + 1);
            }
        }

        // Find common elements
        for (int ele : mp1.keySet()) {

            if (mp2.containsKey(ele)) {

                int count = Math.min(
                    mp1.get(ele),
                    mp2.get(ele)
                );

                for (int i = 0; i < count; i++) {
                    li.add(ele);
                }
            }
        }

        // Convert List to int[]
        int[] ans = new int[li.size()];

        for (int i = 0; i < li.size(); i++) {
            ans[i] = li.get(i);
        }

        return ans;
    }
}
