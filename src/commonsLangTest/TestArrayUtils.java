package commonsLangTest;

import org.apache.commons.lang3.ArrayUtils;

public class TestArrayUtils {
    public static int testIndexOf(Object[] array, Object objectToFind) {
        return ArrayUtils.indexOf(array, objectToFind);
    }

    public static int testIndexOfWithStartIndex(Object[] array, Object objectToFind, int startIndex) {
        return ArrayUtils.indexOf(array, objectToFind, startIndex);
    }

    public static int testLastIndexOf(Object[] array, Object objectToFind) {
        return ArrayUtils.lastIndexOf(array, objectToFind);
    }

    public static boolean testContains(Object[] array, Object objectToFind) {
        return ArrayUtils.contains(array, objectToFind);
    }

    public static Object[] testAdd(Object[] array, Object element) {
        return ArrayUtils.add(array, element);
    }

    public static Object[] testAddAll(Object[] array1, Object... array2) {
        return ArrayUtils.addAll(array1, array2);
    }

    public static Object[] testRemoveElement(Object[] array, Object element) {
        return ArrayUtils.removeElement(array, element);
    }

    public static Object[] testSubarray(Object[] array, int startIndex, int endIndex) {
        return ArrayUtils.subarray(array, startIndex, endIndex);
    }

    public static boolean testIsSameLength(Object[] array1, Object[] array2) {
        return ArrayUtils.isSameLength(array1, array2);
    }

    public static boolean testContainsAll(Object[] array, Object... elements) {
        for (Object element : elements) {
            if (!ArrayUtils.contains(array, element)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        testIndexOf(new Object[]{"a", "b", "c"}, "b");
        System.out.println("Testing ArrayUtils");
    }
}
