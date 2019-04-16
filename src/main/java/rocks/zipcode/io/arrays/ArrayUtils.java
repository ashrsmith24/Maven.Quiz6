package rocks.zipcode.io.arrays;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange(Integer start, Integer end) {
        Integer[] answer = new Integer[end - start + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start + i;


        }
        return answer;
    }

    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {
        char[] answer = new char[array.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = array[i];

        }


        return answer;
    }

    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array) {
        Character[] answer = new Character[array.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = array[i];

        }


        return answer;
    }
}