package Lesson13Hataisleme.readWriteSample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteToFile {

    public static void writing(String filename) throws IOException {

        ArrayList<String> veri = new ArrayList<>();

        for (int i = 0; i < 10; ++i) {
            veri.add("Selam Arkadaş! ");
        }

        try {
            FileWriter fileWriter = new FileWriter(filename);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < veri.size(); ++i) {
                bufferedWriter.write(veri.get(i));
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }

    public static class FileClass {

        private String filename = "src/main/java/org/rd/lessons/lesson13/readWriteSample/test.txt";

        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }
}
}