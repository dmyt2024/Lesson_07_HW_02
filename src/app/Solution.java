package app;

import java.util.Arrays;
import java.util.Random;

public class Solution {

        public static void main(String[] args) {
            Random random = new Random();
            int[] array = new int[20];

            int numMin = 100;
            int in1 = 0;
            int numMax = -100;
            int in2 = 0;
            int sumNeg = 0;
            int numEven = 0;
            int numOdd = 0;

            int minIndNeg = Integer.MAX_VALUE;
            int sumGlob = 0;
            double avgSum = 0;
            int c =0;


            for (int index = 0; index < array.length; index++) {

                array[index] = random.nextInt(200) - 100;

            }


            for (int i = 0; i < array.length; i++) {

                if (array[i] < 0) {
                    sumNeg += array[i];
                }
                if (array[i] < numMin) {
                    numMin = array[i];
                    in1 = i;
                }
                if (array[i] > numMax) {
                    numMax = array[i];
                    in2 = i;
                }
                if (array[i] % 2 == 0) {
                    numEven++;
                }
                if (array[i] % 2 != 0) {
                    numOdd++;
                }
            }
            for (int i = 0; i < array.length; i++) {

                if (array[i] < 0 ) {
                    minIndNeg = Math.min(minIndNeg, i );
                }

                if (i >minIndNeg){
                    sumGlob+= array[i];
                    c++;
                }
            }

            System.out.println("Елементи масиву: " + Arrays.toString(array));
            System.out.println("Сума від'ємних чисел: " + sumNeg);

            System.out.println("Кількість парних чисел: " + numEven);
            System.out.println("Кількість непарних чисел: " + numOdd);

            System.out.println("Найменший елемент: " + numMin + " (з індексом " + in1 + ")");
            System.out.println("Найбільший елемент: " + numMax + " (з індексом " + in2 + ")");

            if (c!=0){
                avgSum = (double) sumGlob / c;
                System.out.println("Середнє арифметичне чисел після першого від'ємного числа: " + avgSum);}
            else {
                System.out.println("Від'ємних чисел немає");

            }
}}
