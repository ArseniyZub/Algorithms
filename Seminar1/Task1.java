package Seminar1;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
class Task1 {
    public static void main(String[] args) {
        // int[] array = new int[]{12, 32, 34, 76, 1};
        // System.out.println(SearchElement(array));

        // System.out.println(div());

        // callMethod();
    }

    static int SearchElement(int[] arr) {
        return arr[-1];
    }

    static int div() {
        int a = 10;
        int b = 0;
        return a/b;
    }

    public static void callMethod() {
        Object obj = null;
        obj.toString();
    }
}