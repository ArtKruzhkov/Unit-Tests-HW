import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);

        NumberListAnalyzer analyzer = new NumberListAnalyzer();
        System.out.println("Среднее значение массива 1: " + analyzer.calculateAverage(list1));
        System.out.println("Среднее значение массива 2: " + analyzer.calculateAverage(list2));
        System.out.println(analyzer.compareAverages(list1, list2));
    }
}