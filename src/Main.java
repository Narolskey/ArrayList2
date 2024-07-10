import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    // дан массив целых чисел длинной n и число k
    // нужно вывести среднее значение подмассивов


    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 5));
        int k = 2;

        printSubarray(arr, k);
    }

    private static void printSubarray(ArrayList<Integer> arr, int k) {
        LinkedList<Integer> subList = new LinkedList<>();
        int sum = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < k; i++) {
            subList.add(arr.get(i));
            sum += arr.get(i);
        }
        result.append((double) sum / k).append(" ");

        for (int i = k; i < arr.size(); i++) {
            sum -= subList.remove(); // Удаляем первый элемент из суммы
            subList.add(arr.get(i));
            sum += arr.get(i); // Добавляем новый элемент в сумму
            result.append((double) sum / k).append(" ");
        }
        System.out.println("res = " + result);
    }
}