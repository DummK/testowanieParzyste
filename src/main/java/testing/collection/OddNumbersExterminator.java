package testing.collection;

import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        if(numbers.isEmpty()) {
            System.out.println("List is empty");
        }
        else {
            for(int i : numbers) {
                numbers.removeIf(n -> n % 2 != 0);
            }

        }
        return numbers;
    }
}
