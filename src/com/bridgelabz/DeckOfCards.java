package com.bridgelabz;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {

    public static ArrayList<String> list = new ArrayList<>();
    public static final int TOTAL_CARDS = 52;
    Scanner scanner =  new Scanner(System.in);
    public static Random random = new Random();

    static final String[] suit = {"Clubs", "Diamond","Heart","Spades"};
    static final String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King", "Ace"};

    private void geCardCombination() {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
               list.add(rank[i]+ " "+ suit[j]);
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        PlayerClass playerClass = new PlayerClass();
        System.out.println("Welcome to Deck of Cards game:");
        deckOfCards.geCardCombination();
        playerClass.multiPlayer();

    }
}
