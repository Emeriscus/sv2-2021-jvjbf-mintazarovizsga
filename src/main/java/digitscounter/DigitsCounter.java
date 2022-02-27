package digitscounter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DigitsCounter {

    public int getCountOfDigits(String s) {

        if (s == null || s.equals("")) {
            return 0;
        }
        Set<Integer> nums = new HashSet<>();
        for (char actual : s.toCharArray()) {
            if (Character.isDigit(actual)) {
                nums.add(Integer.valueOf(actual));
            }
        }
        return nums.size();
    }
}
