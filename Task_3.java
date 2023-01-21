// 3 **Отсортировать первый список пузырьковой сортировкой самостоятельно, 
// без использования доп методов и классов.

import java.util.ArrayList;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    Random rand = new Random();

    for (int i = 0; i < 20; i++) {
        list1.add(rand.nextInt(100));
    }

    System.out.println("\nНачальный список: " + list1);

    for (int i = 0; i < list1.size() - 1; i++) {
        for (int j = 0; j < list1.size() - i - 1; j++) {
            if (list1.get(j) > list1.get(j + 1)) {
                int temp = list1.get(j);
                list1.set(j, list1.get(j + 1));
                list1.set(j + 1, temp);
            }
        }
    }
    
    System.out.println("\nСписок в порядке возрастания: " + list1);

    for (int i = 0; i < list1.size() - 1; i++) {
        for (int j = 0; j < list1.size() - i - 1; j++) {
            if (list1.get(j) < list1.get(j + 1)) {
                int temp = list1.get(j);
                list1.set(j, list1.get(j + 1));
                list1.set(j + 1, temp);
            }
        }
    }
    
    System.out.println("\nСписок в порядке убывания: " + list1);

    }
}
