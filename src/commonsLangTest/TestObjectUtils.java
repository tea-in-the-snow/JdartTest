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

    public static boolean testNotEqual(Object object1, Object object2) {
        return ObjectUtils.notEqual(object1, object2);
    }
    
    public static String testToString(Object obj) {
        return ObjectUtils.toString(obj);
    }

    public static Object testClone(Object obj) {
        return ObjectUtils.clone(obj);
    }
    
    public static Object testCloneIfPossible(Object obj) {
        return ObjectUtils.cloneIfPossible(obj);
    }
    
    public static String testIdentityToString(Object obj) {
        StringBuilder sb = new StringBuilder();
        ObjectUtils.identityToString(sb, obj);
        return sb.toString();
    }
    
    public static Object testMin(Comparable... values) {
        return ObjectUtils.min(values);
    }
    
    public static Object testMax(Comparable... values) {
        return ObjectUtils.max(values);
    }

    public static void main(String[] args) {
        // testGetIfNull(null, new Integer("26"));
        // test(0);
        testFirstNonNull(null, null, "hello", "world");
        System.out.println("Testing ObjectUtils");
    }
}
