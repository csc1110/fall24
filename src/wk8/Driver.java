package wk8;


public class Driver {
    public static void main(String[] args) {
        int num = 3;
        int[] nums = new int[1000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        print(nums);
    }

    public static void print(int[] funStuff) {
        for (int q = funStuff.length - 1; q >= 0; q--) {
            System.out.println(funStuff[q]);
        }
    }
}
