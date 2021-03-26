import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinarySearch {
    private static final Logger logger = LoggerFactory.getLogger("logger");

    public static int findElement(int[] array, int element, int start, int end) {
        logger.debug("Start find index of element between " + start + " and " + end + " elements");
        if (start == end)
            if (array[start] == element) {
                logger.debug("Index of element found");
                return start;
            }
            else {
                logger.debug("Index of element dont found");
                return -1;
            }


        int mid = (start + end) / 2;
        if (element > array[mid])
            return findElement(array, element, mid + 1, end);
        else
            return findElement(array, element, start, mid);

    }
}
