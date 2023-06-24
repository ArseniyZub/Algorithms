package Seminar1;
// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого
//  равен разности элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
public class Task2 {
    public static void main(String[] args) {
        int[] firstArr = new int[]{123, 3, 43, 53, 767, 1};
        int[] secondArr = new int[]{83, 3949, 18, 91, 41, 1};

        printArray(differenceArrays(firstArr, secondArr));
    }

    static int[] differenceArrays(int[] firstArr, int[] secondArr) {
        if (firstArr.length != secondArr.length) {
            throw new RuntimeException("Длины массвов не равны");
        }

        int[] newArr = new int[firstArr.length];
        for (int i = 0; i < secondArr.length; i++) {
            newArr[i] = firstArr[i] - secondArr[i];
        }
        return newArr;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
