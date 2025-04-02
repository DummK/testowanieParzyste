package testing.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("List is empty");
            return numbers;
        }
        else {
            List<Integer> oddNumbers = new ArrayList<>();
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    oddNumbers.add(number);
                }
            }
            return oddNumbers;
        }
    }
}
