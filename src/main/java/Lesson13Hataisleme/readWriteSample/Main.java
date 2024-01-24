package Lesson13Hataisleme.readWriteSample;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        WriteToFile.FileClass fileClass = new WriteToFile.FileClass();
        File  file = new File(fileClass.getFilename());
        if(!file.exists()) {
            file.createNewFile();
        }

        //verilen dosya ismine 10 kere Merhaba Dunyali yazan metod
        WriteToFile.writing(fileClass.getFilename());

        // dosyadaki ilk satırı ekrana yazar
        System.out.println(ReadFile.readLine());

        //dosyadaki yazılanları istenilen split'e göre böler
        //ve ekrana yazar
        ReadFile.splitLine(" ");

    }
}
