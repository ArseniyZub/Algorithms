package Seminar3;

public class CheckData {

    public static String[] parseUserData(String userInput) throws InputDataException {
        String[] data = userInput.split(" ");

        if (data.length != 4) {
            throw new InputDataException("Введено недостаточно данных");
        }

        return data;
    }

    public static void validUserData(String[] data) throws InputDataException {
        String fullNameRegex = "[а-яА-Яa-zA-Z]+";
        String phoneNumberRegex = "\\d+";
        
        if (!data[0].matches(fullNameRegex) ||
            !data[1].matches(fullNameRegex) ||
            !data[2].matches(fullNameRegex)) {
            
            throw new InputDataException("Неккоректный формат ФИО");
        }

        if (!data[3].matches(phoneNumberRegex)) {
            throw new InputDataException("Некорректный формат номера телефона");
            
        }
    }
}
