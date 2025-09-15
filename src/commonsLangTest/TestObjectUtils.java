package commonsLangTest;

public class TestObjectUtils {
    public static boolean test(int a) {
        if (a == 0) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        test(0);
        System.out.println("Testing ObjectUtils");
    }
}
