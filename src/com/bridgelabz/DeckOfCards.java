package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {

    String[] suit = {"Clubs", "Diamond","Heart","Spades"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King", "Ace"};
    String[][] combination = new String[4][13];
    String[][] player = new String[4][9];


    private void geCardCombination() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                combination[i][j] = rank[j] + suit[i];
             //   System.out.println(combination[i][j]);
            }
        }
    }
    private void multiplayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of players: ");
        int n = scanner.nextInt();
        Random random = new Random();
        for (int i = 1; i < n; i++){
            System.out.println("\nPlayer: "+(i+1));
            for (int j = 0; j < 9; j++){
                int randomSuit = random.nextInt(4);
                int randomRank = random.nextInt(13);
                player[i][j] = combination[randomSuit][randomRank];
                System.out.println(player[i][j] + " ");
            }
        }


    }

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        System.out.println("Welcome to Deck of Cards game:");
        deckOfCards.geCardCombination();
        deckOfCards.multiplayer();
    }
}
