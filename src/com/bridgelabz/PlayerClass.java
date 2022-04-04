package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class PlayerClass {
    Scanner scanner =  new Scanner(System.in);
    Random random = new Random();

    void multiPlayer(){
        DeckOfCards deckOfCards = new DeckOfCards();

        System.out.println("Enter Number of player: ");
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++){
            System.out.println("\nPlayer: "+(i+1));
            for (int j = 0; j < 9; j++){
                int randomSuit = random.nextInt(4);
                int randomRank = random.nextInt(13);
                DeckOfCards.player[i][j] = DeckOfCards.combination[randomSuit][randomRank];
                System.out.println(DeckOfCards.player[i][j] + " ");
            }
        }
    }
}
