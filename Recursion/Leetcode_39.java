import java.util.*;

class Solution {
    public void solve(int i, List<List<Integer>> result, int[] candidates, int target, int sum, List<Integer> li) {
        // Base case: target met
        if (sum == target) {
            result.add(new ArrayList<>(li)); // Copy the list
            return;
        }
        
        // Base case: went over target or ran out of candidates
        if (sum > target || i == candidates.length) {
            return;
        }
        
        // Choice 1: Pick the current candidate
        li.add(candidates[i]);
        // Note: We use 'i' again because we can reuse the same element
        solve(i, result, candidates, target, sum + candidates[i], li);
        
        // Backtrack: remove the last element
        li.remove(li.size() - 1);
        
        // Choice 2: Don't pick this candidate, move to the next index
        solve(i + 1, result, candidates, target, sum, li);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        solve(0, result, candidates, target, 0, new ArrayList<>());
        return result;
    }
}