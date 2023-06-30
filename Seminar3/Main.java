package Seminar3;

import java.io.IOException;

class Main {
    public static void main(String[] args) {
        try {
            String userInput = InputData.getUserInput(); 

            String[] data = CheckData.parseUserData(userInput);
            CheckData.validUserData(data);

            saveDataToFile.saveToFile(data);
            System.out.println("Данные успешно сохранены.");
            
        } 
        catch (InputDataException e) {
            System.out.println("Входные данные неверны: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка сохранения файлов:" + e.getMessage());
        }
    }
}
