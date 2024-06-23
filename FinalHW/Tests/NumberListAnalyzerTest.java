import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
public class NumberListAnalyzerTest {
    private final NumberListAnalyzer analyzer = new NumberListAnalyzer();

    @Test
    public void testCalculateAverage() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(3.0, analyzer.calculateAverage(numbers));
    }

    @Test
    public void testCalculateAverage_EmptyList() {
        List<Integer> list = Arrays.asList();
        assertThrows(IllegalArgumentException.class, () -> analyzer.calculateAverage(list));
    }

    @Test
    public void testCalculateAverage_NullList() {
        assertThrows(IllegalArgumentException.class, () -> analyzer.calculateAverage(null));
    }

    @Test
    public void testCompareAverages_FirstGreater() {
        List<Integer> list1 = Arrays.asList(6, 5, 1);
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        assertEquals("Первый список имеет большее среднее значение", analyzer.compareAverages(list1, list2));
    }

    @Test
    public void testCompareAverages_SecondGreater() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(6, 5, 1);
        assertEquals("Второй список имеет большее среднее значение", analyzer.compareAverages(list1, list2));
    }

    @Test
    public void testCompareAverages_Equal() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        assertEquals("Средние значения равны", analyzer.compareAverages(list1, list2));
    }

}
