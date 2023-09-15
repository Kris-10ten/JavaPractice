import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
    public static int missingNumber(int [] numbers, int maxNum) {
        List<Integer> numberList = new ArrayList<>();
        for (int num : numbers) {
            numberList.add(num);
        }

        for (int i = 1; i <= maxNum; i++) {
            if (!numberList.contains(i)) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = 10;

        int missing = missingNumber(numbers, maxNum);
        System.out.println("Missing number: " + missing);
    }
}


