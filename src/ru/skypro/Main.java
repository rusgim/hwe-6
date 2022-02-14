package ru.skypro;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.print("\n");
        int min = arr[0];
        int max = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("Максимальные затраты за день " + max);
        System.out.println("Минимальные затраты за день " + min);
        System.out.print("\n");
        float averageValue = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");
    }
}
