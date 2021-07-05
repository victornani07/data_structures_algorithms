import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    private static int visited = 0;

    public static void isConnected(HashMap<Integer, List<Integer>> binaryTree, Integer key) {
        ++visited;
        List<Integer> childs = binaryTree.get(key);

        if(childs != null)
            for (Integer child : childs)
                isConnected(binaryTree, child);
    }

    public static String TreeConstructor(String[] strArr) {
        if (strArr.length == 1)
            return "true";

        HashMap<Integer, List<Integer>> binaryTree = new HashMap<>();
        Integer root = null;

        for (String s : strArr) {
            String[] pair = s.split(",");
            Integer child = Integer.parseInt(pair[0].substring(1));
            Integer parent = Integer.parseInt(pair[1].substring(0, pair[1].length() - 1));

            if (root == null)
                root = parent;
            else
                if (root == child)
                    root = parent;

            if (!binaryTree.containsKey(parent)) {
                List<Integer> childs1 = new ArrayList<>();
                List<Integer> childs2 = new ArrayList<>();
                childs1.add(child);
                binaryTree.put(parent, childs1);
                binaryTree.putIfAbsent(child, childs2);
            } else {
                List<Integer> childs1 = binaryTree.get(parent);
                if (childs1.size() < 2) {
                    List<Integer> childs2 = new ArrayList<>();
                    childs1.add(child);
                    binaryTree.replace(parent, childs1);
                    binaryTree.putIfAbsent(child, childs2);
                } else
                    return "false";
            }
        }

        isConnected(binaryTree, root);

        return Boolean.toString(visited == binaryTree.size());
    }

    public static void main(String[] args) {
        String[] strArr = new String[] {"(1,2)", "(2,4)", "(7,4)"};
        System.out.println(TreeConstructor(strArr));
    }
}
