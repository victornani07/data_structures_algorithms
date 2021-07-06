public class Main {
    public static void main(String[] args) {
        TreeNode root = null;

        ConstructBST constructor = new ConstructBST();

        root = constructor.insert(root, 10);
        root = constructor.insert(root, 5);
        root = constructor.insert(root, 3);
        root = constructor.insert(root, 7);
        root = constructor.insert(root, 15);
        root = constructor.insert(root, 18);

        Solution solution = new Solution();
        System.out.println(solution.rangeSumBST(root, 7, 15));
    }
}
