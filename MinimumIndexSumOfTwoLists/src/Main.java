public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] list1 = new String[]{"KFC"};
        String[] list2 = new String[]{"KFC"};

        for(String s : solution.findRestaurant(list1, list2))
            System.out.println(s);
    }
}
