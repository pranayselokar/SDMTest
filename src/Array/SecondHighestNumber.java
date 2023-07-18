package Array;

import java.util.Arrays;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] numbers = {100, 14, 46, 47, 98, 94, 52, 36, 34, 89};
        
        Arrays.sort(numbers);
        
        int secondHighest = numbers[numbers.length - 2];
        
        System.out.println("The second highest number is: " + secondHighest);
    }
}
