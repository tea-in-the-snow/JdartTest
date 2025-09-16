package commonsLangTest;

import org.apache.commons.lang3.ObjectUtils;

public class TestObjectUtils {
    public static boolean test(int a) {
        if (a == 0) {
            return false;
        }
        return true;
    }

    public static Object testGetIfNull(Object obj, Object defaultObj) {
        return ObjectUtils.getIfNull(obj, defaultObj);
    }

    public static Object testFirstNonNull(Object... objects) {
        return ObjectUtils.firstNonNull(objects);
    }

    public static void main(String[] args) {
        // testGetIfNull(null, new Integer("26"));
        // test(0);
        testFirstNonNull(null, null, "hello", "world");
        System.out.println("Testing ObjectUtils");
    }
}
