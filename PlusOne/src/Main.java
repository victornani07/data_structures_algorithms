public class Main {
    public static void main(String[] args) {
        Solutioon solutioon = new Solutioon();
        int[] digits = new int[]{1, 9, 9};

        for(int i : solutioon.plusOne(digits))
            System.out.print(i);
    }
}
