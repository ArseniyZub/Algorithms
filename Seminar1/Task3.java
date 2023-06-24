package Seminar1;
// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя. 
// Важно: При выполнении метода единственное исключение,
//  которое пользователь может увидеть - RuntimeException, т.е. ваше.
public class Task3 {
    public static void main(String[] args) {
        int[] firstArr = new int[]{1000, 32, 14, 34, 938, 2};
        int[] secondArr = new int[]{123, 15, 67, 32, 1, 12};
        
        printArray(div(firstArr, secondArr));
    }

    static double[] div(int[] firstArr, int[] secondArr) {
        if (firstArr.length != secondArr.length) {
            throw new RuntimeException("Длины массвов не равны");
        }

        double[] newArr = new double[firstArr.length];
        for (int i = 0; i < secondArr.length; i++) {
            if (firstArr[i] == 0 || secondArr[i] == 0) {
                throw new RuntimeException(
                    "Один из элементов равен нулю, проверьте введенный массив");
            }
            newArr[i] = Math.round((double)firstArr[i]/secondArr[i] * 1000.0)/1000.0;
        }
        return newArr;
    }

    static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
