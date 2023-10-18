package s103_Java_Collections.S103_N1exercise3;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;

public class Guessing_Game {
    private File_Reader fileHandler;
    private HashMap<String, String> countriesCapitals;

    public Guessing_Game(File_Reader fileHandler) {
        this.fileHandler = fileHandler;
        try {
            this.countriesCapitals = fileHandler.reading_File("D:\\IdeaProjects\\s1_Java_Language\\src\\main\\java\\s103_Java_Collections\\S103_N1exercise3\\countries.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
    public void startGuessingGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNumber;
        try {
            userNumber = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid number entered.");
            return;
        }
        sc.nextLine();

        int score = 0;
        for (int i = 0; i < 10; i++) {
            String randomCountry = getRandomCountry();
            String actualCapital = countriesCapitals.get(randomCountry);
            String answer;

            System.out.println("Guess the capital of " + randomCountry + ": ");
            answer = sc.nextLine();

            if (answer.equalsIgnoreCase(actualCapital)) {
                score++;
            } else {
                System.out.println("Incorrect! The capital is " + actualCapital + ".");
            }
    }
        System.out.println("Your final score is: " + score);

        try {
            fileHandler.user_Score(userNumber,score);
        } catch (IOException e) {
            System.out.println("An error ocurred while writing the file: " + e.getMessage());
        }
    }
    private String getRandomCountry() {
        Random random = new Random();
        int index = random.nextInt(countriesCapitals.size());
        return (String) countriesCapitals.keySet().toArray()[index];
    }
}
