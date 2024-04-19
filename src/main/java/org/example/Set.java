package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class Set {

        public static void main(String[] args) {
            Random random = new Random();
            int[] numbers = new int[10];

            System.out.println("Random 10 eded");
            for (int i = 0; i < 10; i++) {
                numbers[i] = random.nextInt(21);
                System.out.print(numbers[i] + " ");
            }
            System.out.println();


            Map<Integer, Integer> repetitionCounts = new HashMap<>();
            for (int number : numbers) {
                if (repetitionCounts.containsKey(number)) {
                    repetitionCounts.put(number, repetitionCounts.get(number) + 1);
                } else {
                    repetitionCounts.put(number, 1);
                }
            }


            System.out.println("Tekrarlar:");
            for (Map.Entry<Integer, Integer> entry : repetitionCounts.entrySet()) {
                System.out.println(entry.getKey() + " sayı " + entry.getValue() + " defe tekrarlanib ");
            }
        }
    }







