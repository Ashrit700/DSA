class Solution {
    // We use a global/class variable to bypass the pass-by-value issue for our final answer
    int matchingSubtrees = 0;

    public int averageOfSubtree(TreeNode root) {
        postOrder(root);
        return matchingSubtrees;
    }

    // This method returns an array of 2 integers to its parent:
    // int[0] = Sum of the subtree
    // int[1] = Number of nodes in the subtree
    private int[] postOrder(TreeNode node) {
        // Base case: A null node has a sum of 0 and a count of 0
        if (node == null) {
            return new int[]{0, 0};
        }

        // 1. Traverse Left (Get sum and count from the left child)
        int[] left = postOrder(node.left);
        
        // 2. Traverse Right (Get sum and count from the right child)
        int[] right = postOrder(node.right);

        // 3. Process Current Node (Combine children's data with our own)
        int currentSum = left[0] + right[0] + node.val;
        int currentCount = left[1] + right[1] + 1;

        // 4. Check the condition (integer division drops the decimal automatically)
        if (currentSum / currentCount == node.val) {
            matchingSubtrees++;
        }

        // 5. Return our combined data UP to our parent
        return new int[]{currentSum, currentCount};
    }
}