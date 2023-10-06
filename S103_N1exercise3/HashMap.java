package s103_Java_Collections.S103_N1exercise3;

import java.io.*;
import java.util.*;

public class HashMap {
    public static void main(String[] args) {
        try {
            java.util.HashMap<String, String> countriesCapitals = readCountriesFromFile("countries.txt");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your number: ");
            int userNumber;
            try {
                userNumber = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid number entered.");
                scanner.close();
                return;
            }
            scanner.nextLine();

            int score = 0;
            for (int i = 0; i < 10; i++) {
                String randomCountry = getRandomCountry(countriesCapitals);
                String actualCapital = countriesCapitals.get(randomCountry);

                System.out.println("Guess the capital of " + randomCountry + ": ");
                String answer = scanner.nextLine();

                if (answer.equalsIgnoreCase(actualCapital)) {
                    score++;
                } else {
                    System.out.println("Incorrect! The Capital is " + actualCapital);
                }
            }
            System.out.println("Your final score is: " + score);

            saveScoreToFile(userNumber, score);
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file: " + e.getMessage());
        }
    }
    private static java.util.HashMap<String, String> readCountriesFromFile(String fileName) throws IOException {
        java.util.HashMap<String, String> countriesCapitals = new java.util.HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length > 1) {
                    String country = parts[0];
                    String capital = parts[1];
                    countriesCapitals.put(country, capital);
                }
            }
        }
        return countriesCapitals;
    }
    private static String getRandomCountry(java.util.HashMap<String, String> countriesCapitals) {
        Random random = new Random();
        int index = random.nextInt(countriesCapitals.size());
        return (String) countriesCapitals.keySet().toArray()[index];
    }
    private static void saveScoreToFile(int userNumber, int score) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("classification.txt", true))) {
            writer.write(userNumber + ": " + score);
            writer.newLine();
        }
    }
}