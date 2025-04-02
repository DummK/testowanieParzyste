package testing.collection;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
        private OddNumbersExterminator exterminator;

        @BeforeEach
            void beforeEach() {
                System.out.println("Test start");
                exterminator = new OddNumbersExterminator();
            }

        @AfterEach
            void afterEach() {
                System.out.println("Test end");
            }

        @DisplayName("When input list is empty, then returned list should also be empty")
            @Test
                public void testOddNumbersExterminatorEmptyList() {
                    //Given
                    exterminator = new OddNumbersExterminator();
                    List<Integer> numbers = Arrays.asList();

                    //When
                    List<Integer> result = exterminator.exterminate(numbers);

                    //Then
                    Assertions.assertTrue(result.isEmpty());
                }

        @DisplayName("When input list is not empty, then returned list should also be not empty")
            @Test
                public void testOddNumbersExterminatorNormalList() {
                    //Given
                    exterminator = new OddNumbersExterminator();
                    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                    List<Integer> expectedResult = Arrays.asList(2, 4, 6, 8, 10);

                    //when
                    List<Integer> result =  exterminator.exterminate(numbers);

                    //then
                    Assertions.assertEquals(expectedResult, result);
                }
}
