import org.apache.commons.lang3.ArrayUtils;

public class Input {
    public static boolean test(int[] arr, int val) {
        // if (val == 0) {
        //     return false;
        // }
        // return true;
        return ArrayUtils.contains(arr, val);
    }

    public static void main(String[] args) {
        test(new int[]{1,2,3}, 2);
    }
}