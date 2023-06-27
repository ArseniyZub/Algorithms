package Seminar2;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, 
// когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя
public class Task4 {
    public static void main(String[] args) {
        printInputLine();
    }

    public static void printInputLine() {
        Scanner in = new Scanner(System.in);
        
        try {
            System.out.print("Введите что-нибудь:");
            String line = in.nextLine();

            if (line.isEmpty()) {
                throw new Exception("Вы ввели путую строку! " +
                                    "Повторите попытку");
            }
            System.out.println("Ваша строка: " + line); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } 
}
