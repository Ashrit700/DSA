import java.util.*;

class Solution {
    static class Interval {
        int left, right, weight, originalIndex;
        Interval(int left, int right, int weight, int originalIndex) {
            this.left = left;
            this.right = right;
            this.weight = weight;
            this.originalIndex = originalIndex;
        }
    }

    static class Result {
        long weight;
        List<Integer> selected;
        Result(long weight, List<Integer> selected) {
            this.weight = weight;
            this.selected = selected;
        }
    }

    public int[] maximumWeight(List<List<Integer>> intervalsList) {
        int n = intervalsList.size();
        Interval[] intervals = new Interval[n];
        for (int i = 0; i < n; i++) {
            List<Integer> item = intervalsList.get(i);
            intervals[i] = new Interval(item.get(0), item.get(1), item.get(2), i);
        }

        // Sort intervals primarily by start time
        Arrays.sort(intervals, (a, b) -> {
            if (a.left != b.left) return Integer.compare(a.left, b.left);
            if (a.right != b.right) return Integer.compare(a.right, b.right);
            return Integer.compare(a.originalIndex, b.originalIndex);
        });

        // Precompute next non-overlapping interval using binary search
        int[] nextIdx = new int[n];
        for (int i = 0; i < n; i++) {
            int low = i + 1, high = n - 1;
            int res = n;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (intervals[mid].left > intervals[i].right) {
                    res = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            nextIdx[i] = res;
        }

        Result[][] dp = new Result[n + 1][5];
        for (int c = 0; c <= 4; c++) {
            dp[n][c] = new Result(0L, new ArrayList<>());
        }
        for (int i = 0; i <= n; i++) {
            dp[i][0] = new Result(0L, new ArrayList<>());
        }

        // Fill DP table iteratively from right to left
        for (int i = n - 1; i >= 0; i--) {
            for (int c = 1; c <= 4; c++) {
                Result skip = dp[i + 1][c];
                
                int next = nextIdx[i];
                Result nextRes = dp[next][c - 1];
                
                List<Integer> newSelected = new ArrayList<>(nextRes.selected);
                newSelected.add(intervals[i].originalIndex);
                Collections.sort(newSelected);
                
                Result pick = new Result(intervals[i].weight + nextRes.weight, newSelected);
                
                if (pick.weight > skip.weight) {
                    dp[i][c] = pick;
                } else if (skip.weight > pick.weight) {
                    dp[i][c] = skip;
                } else {
                    dp[i][c] = compareLists(pick.selected, skip.selected) < 0 ? pick : skip;
                }
            }
        }

        List<Integer> best = dp[0][4].selected;
        int[] ans = new int[best.size()];
        for (int i = 0; i < best.size(); i++) {
            ans[i] = best.get(i);
        }
        return ans;
    }

    private int compareLists(List<Integer> list1, List<Integer> list2) {
        int minSize = Math.min(list1.size(), list2.size());
        for (int i = 0; i < minSize; i++) {
            int cmp = Integer.compare(list1.get(i), list2.get(i));
            if (cmp != 0) return cmp;
        }
        return Integer.compare(list1.size(), list2.size());
    }
}