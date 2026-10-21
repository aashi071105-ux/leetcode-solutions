import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[n - k + 1];
        int idx = 0;

        for (int j = 0; j < n; j++) {

            while (!dq.isEmpty() && dq.peekFirst() <= j - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[j]) {
                dq.pollLast();
            }

            dq.offerLast(j);

            if (j >= k - 1) {
                ans[idx] = nums[dq.peekFirst()];
                idx++;
            }
        }

        return ans;
    }
}