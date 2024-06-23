import java.util.List;
public class NumberListAnalyzer {

    public NumberListAnalyzer() {}

    public double calculateAverage(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }

    public String compareAverages(List<Integer> list1, List<Integer> list2) {
        final double average1 = calculateAverage(list1);
        final double average2 = calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
