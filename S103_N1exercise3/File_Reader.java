package s103_Java_Collections.S103_N1exercise3;

import java.io.*;
import java.util.HashMap;
public class File_Reader {
    public HashMap<String, String> reading_File(String file) throws IOException {
        HashMap<String, String> countries_Capitals = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] strings = line.split(" ");
                if(strings.length > 1) {
                    String country = strings[0];
                    String capital = strings[1];
                    countries_Capitals.put(country, capital);
                }
            }
        }
        return countries_Capitals;
    }
    public void user_Score(int userNumber, int score) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\IdeaProjects\\s1_Java_Language\\src\\main\\java\\s103_Java_Collections\\S103_N1exercise3\\classification.txt", true))){
            writer.write(userNumber + ": " + score);
            writer.newLine();
        }
    }
}
