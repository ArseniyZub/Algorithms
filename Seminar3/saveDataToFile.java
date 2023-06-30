package Seminar3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class saveDataToFile {
    public static void saveToFile(String[] data) throws IOException{
        String fileName = data[0] + ".txt";

        try (BufferedWriter write = new BufferedWriter(new FileWriter(fileName, true))){
            write.write(data[0] + " " + 
                        data[1] + " " + 
                        data[2] + " " +
                        data[3] + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
