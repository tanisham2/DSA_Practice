class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }
    
    private void traverse(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        
        // Visit left subtree
        traverse(node.left, result);
        
        // Visit current node
        result.add(node.val);
        
        // Visit right subtree
        traverse(node.right, result);
    }
}
