package s103_Java_Collections.S103_N1exercise3;

public class Main {
    public static void main(String[] args) {
        File_Reader readerObj = new File_Reader();
        Guessing_Game guessingGame = new Guessing_Game(readerObj);
        guessingGame.startGuessingGame();

    }
}