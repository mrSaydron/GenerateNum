import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenerateNum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        System.out.println(generateNum(numbers));
    }

    private static final String TEMPLATE = "%03d";

    public static String generateNum(List<Integer> numbers) {
        Integer maxValue = findMaxValue(numbers);
        return String.format(TEMPLATE, maxValue);
    }

    private static Integer findMaxValue(List<Integer> numbers) {
        Integer result = 1;

        if (numbers != null && !numbers.isEmpty()) {
            List<Integer> numbersSort = numbers.stream().sorted(Integer::compareTo).collect(Collectors.toList());
            result = numbersSort.get(numbersSort.size() - 1) + 1;

            for (int i = numbersSort.size() - 1; i > 0; i--) {
                if (numbersSort.get(i) > numbersSort.get(i - 1) + 1) {
                    result = numbersSort.get(i) - 1;
                    break;
                }
            }
        }

        return result;
    }
}
