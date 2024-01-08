import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

//Напишите программу, которая использует Stream API для обработки списка чисел.
//        Программа должна вывести на экран среднее значение всех четных чисел в списке.

public class Main {
    public static void main(String[] args) {
        System.out.println("Ввод: ");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 6, 8, 0, 10, 18, 5, 7, 22, 41);

        OptionalDouble average = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .average();

        if (average.isPresent()) {
            System.out.println("Среднее значение всех четных чисел в списке: " + average.getAsDouble());
        } else {
            System.out.println("В списке нет четных чисел.");
        }

    }
}