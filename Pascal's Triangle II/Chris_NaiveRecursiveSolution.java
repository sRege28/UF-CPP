import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * O(2^n) time, O(2^n) space
 */
public class Chris_NaiveRecursiveSolution implements Solution {
    @Override
    public List<Integer> getRow(int rowIndex) {

        return help(rowIndex);
    }

    private List<Integer> help(int k) {
        if (k == 0) return Arrays.asList(1);
        else if (k == 1) return Arrays.asList(1, 1);
        // k >=2

        List<Integer> kmOne = help(k - 1);
        List<Integer> list = new ArrayList<>();
        list.add(kmOne.get(0));
        for (int i = 1; i < kmOne.size(); i++) {
            list.add(kmOne.get(i) + kmOne.get(i - 1));
        }
        list.add(kmOne.get(kmOne.size() - 1));
        return list;
    }
}
