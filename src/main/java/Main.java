import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("aStr2", "Str1", "aStr3", "", null, "a", "a");

        /** Вывод строк которые содержат букву 'a' в начале**/
        System.out.println("Вывод строк которые содержат букву 'a' в начале: ");
        strings.stream()
                .filter(Objects::nonNull)
                .filter(str -> !str.isEmpty() && str.charAt(0) == 'a')
                .forEach(System.out::println);


        /** Вывод без дубликатов строк**/
        System.out.println("Вывод без дубликатов строк: ");
        strings.stream()
                .filter(Objects::nonNull)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);


        /** Применение функции изменения регистра текста к первым 5 элементам**/
        System.out.println("Применение функции изменения регистра текста к первым 5 элементам: ");
        strings.stream()
                .limit(5)
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .peek((str) -> System.out.println(str))
                .collect(Collectors.toList());


        /** Вывод первого элемента**/
        System.out.println("Первый элемент в списке: ");
        System.out.println("First element: " +
                strings.stream()
                        .findFirst()
                        .orElse("1")
        );


        /** Возвращает любой элемент содержащий 'a'**/
        System.out.println("Любой элемент в списке, содержащий 'a': " +
                strings.stream()
                        .findAny()
                        .orElse("a")
        );


        /** Подсчет количества элементов**/
        System.out.println("Количество элементов в списке: " +
                strings.stream()
                .count()
        );


        List<String> integerList = Arrays.asList("55", "66", "11", "22", "99", "44", "33", "44");

        /** Сортировка**/
        System.out.println("Отсортированный список: ");
        integerList.stream()
                .sorted((i1, i2) -> i1.compareTo(i2))
                .forEach(System.out::println);


        /** Вывод максимального элемента**/
        System.out.println("Максимальный элемент: " +
                integerList.stream()
                        .mapToInt((s) -> Integer.parseInt(s))
                        .max()
        );


        /** Вывод среднего арифметического**/
        System.out.println("Среднее арифметическое: " +
                integerList.stream()
                        .mapToInt((s) -> Integer.parseInt(s))
                        .average()
        );
    }
}
