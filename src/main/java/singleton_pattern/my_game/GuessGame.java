package singleton_pattern.my_game;

import java.io.Serial;
import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {


    private static GuessGame instance = new GuessGame();
    private static int points = 0;

    public static GuessGame getInstance() {
        return instance;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Podaj liczbę " + i);
           int numberToGuess = rollRandom();
           if (numberToGuess == scanner.nextInt()) {
               points++;
               System.out.println("Brawo, dobra liczba!");
               System.out.println();
           } else {
               System.out.println("Myslalem o innej liczbie");
               System.out.println();
           }
        }
        System.out.println();
        System.out.println("Wynik: " + getScore());
    }

    public int getScore() {
        return points;
    }

    //in case of serializing this Object
    protected Object readResolve(){
        return instance;
    }

    private int rollRandom() {
        Random random = new Random();
        return random.nextInt(0,10);
    }
}
