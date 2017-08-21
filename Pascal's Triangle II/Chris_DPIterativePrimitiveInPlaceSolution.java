import java.util.ArrayList;
import java.util.List;

/**
 * using primitive data type for better performance. Only need O(k) extra
 * space, O(n^2) time. We can use the stream to make to code more concise
 * just as shown in the comment, but that will affect the OJ performance.
 * So using a for loop instead one line stream return.
 */
public class Chris_DPIterativePrimitiveInPlaceSolution implements Solution {
    @Override
    public List<Integer> getRow(int rowIndex) {
        int[] line = new int[rowIndex + 1];
        line[0] = 1;

        for (int idx = 1; idx < rowIndex + 1; idx++) {
            int prev = 0, curr = 0;
            for (int j = 0; j < idx + 1; j++) {
                curr = line[j];
                line[j] = prev + curr;
                prev = curr;
            }
        }

//        return Arrays.stream(res).boxed().collect(Collectors.toList());
        List<Integer> res = new ArrayList<>();
        for (int num : line) {
            res.add(num);
        }

        return res;
    }
}
