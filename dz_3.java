// // 1. Пусть дан произвольный список целых чисел, удалить из него четные числа


// import java.util.Arrays;
// import java.util.Random;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n;
//         do {
//             System.out.print("Введите длинну массива (n >= 2): ");
//             n = sc.nextInt();
//         } while (n < 2);
//         int[] array = createRandomArray(n, 1, 9);

//         System.out.println("Дан массив: " + Arrays.toString(array));

//         int[] arrayZero = evenElementsMakeZero(Arrays.copyOf(array, array.length));
//         System.out.println("Обнуляем чётные элементы: " + Arrays.toString(arrayZero));

//         int[] arrayDelete = deleteEvenElement(Arrays.copyOf(array, array.length));
//         System.out.println("Удаляем чётные элементы массива: " + Arrays.toString(arrayDelete));
//     }

//     public static int[] createRandomArray(int length, int min, int max) {
//         int[] result = length > 0 ? new int[length] : new int[0];
//         if (length > 0) {
//             Random rand = new Random();
//             for (int index = 0; index < length; index++) {
//                 result[index] = rand.nextInt(Math.abs(max - min) + 1) + min;
//             }
//         }
//         return result;
//     }

//     public static int[] evenElementsMakeZero(int[] array) {
//         int index = 0;
//         while (index < array.length) {
//             array[index] = 0;
//             index += 2;
//         }
//         return array;
//     }

//     public static int[] deleteEvenElement(int[] array) {
//         int[] result = new int[array.length / 2];
//         int index = 1;
//         for (int i = 0; i < result.length; i++) {
//             result[i] = array[index];
//             index += 2;
//         }
//         return result;
//     }
// }

// // 2. Найти минимальное, максимальное и среднее арифметическое из этого списка.
// import java.util.ArrayList;
// import java.util.Collections;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<Integer> ar = new ArrayList<>();
//         ar.add(12);
//         ar.add(21);
//         ar.add(111);
//     }

// double average = 0;

// if(ar.length > 0)
//     {
//     double sum = 0;
//     for (int j = 0; j < ar.length; j++) {
//         sum += ar[j];
//     }
//     average = sum / ar.length;
//     }
//     System.out.println(Collections.max(list));
//     System.out.println(Collections.min(list));
//     System.out.println(average(ar))
// }

// 3. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.

// import java.util.ArrayList;
 
// public class Program{
      
//     public static void main(String[] args) {
          
//         ArrayList<String> people = new ArrayList<String>();
//         // добавим в список ряд элементов
//         people.add("Вася");
//         people.add("8");
//         people.add("Катя");
//         people.add("345");
//         people.add(1, "Вова"); // добавляем элемент по индексу 1
          
//         System.out.println(people.get(1));
//         people.set(1, "Родион"); 
          
//         System.out.printf("ArrayList has %d elements \n", people.size());
//         for(String person : people){
          
//             System.out.println(person);
//         }
//         if(people.contains("Вася")){
//             System.out.println("ArrayList contains Вася");
//         }
//         people.remove("8");        
//         people.remove(0);     
//         Object[] peopleArray = people.toArray();
//         for(Object person : peopleArray){
          
//             System.out.println(person);
//         }
//     }
// }