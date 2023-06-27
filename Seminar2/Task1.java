package Seminar2;
import java.util.InputMismatchException;
import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа 
// (типа float), и возвращает введенное значение. 
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, 
// необходимо повторно запросить у пользователя ввод данных.
class Seminar2 {
    public static void main(String[] args) {
        System.out.println("Ваше число: " + inputValue());
    }
    
    public static float inputValue() {
        Scanner in = new Scanner(System.in);

        float value = 0.0f;
        boolean correctValue = false;

        do {
            try {
                System.out.print("Ведите число типа float: ");

                String input = in.nextLine();
                value = Float.parseFloat(input);
                correctValue = true;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число " + 
                                   "или оно не является float");
            }
        } while (!correctValue);
        return value;
    }
}