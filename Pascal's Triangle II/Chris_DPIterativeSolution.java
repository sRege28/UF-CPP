import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * O(n^2) time, O(n) space. Using two lists to hold the previous array and current array val. Technically it's O(n) space.
 */
public class Chris_DPIterativeSolution implements Solution {
    @Override
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) return Arrays.asList(1);
        else if (rowIndex == 1) return Arrays.asList(1, 1);
        List<Integer> old_list = Arrays.asList(1, 1);
        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> new_list = new ArrayList<>();
            new_list.add(old_list.get(0));
            for (int j = 1; j < old_list.size(); j++) {
                new_list.add(old_list.get(j) + old_list.get(j - 1));
            }
            new_list.add(old_list.get(old_list.size() - 1));
            old_list = new_list;
        }

        return old_list;

    }


}
