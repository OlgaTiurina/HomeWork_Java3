// 2 * Отсортировать второй список методом sort списка и компаратором по уменьшению. 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;

public class Task_2 {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>();

    Random randomNumber = new Random();
    for (int i = 0; i < 20; i++) {
        list1.add(randomNumber.nextInt(100));
  }
  System.out.println("\nНачальный список: " + list1);

  list1.sort(Collections.reverseOrder(Comparator.comparingInt(Integer::intValue)));
  System.out.println("Список по убыванию: " + list1 + "\n");
}

}