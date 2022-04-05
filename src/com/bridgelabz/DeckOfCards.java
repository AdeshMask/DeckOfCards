package com.bridgelabz;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {

    public static ArrayList<String> list = new ArrayList<>();
    public static final int TOTAL_CARDS = 52;
    Scanner scanner =  new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        PlayerClass playerClass = new PlayerClass();
        System.out.println("Welcome to Deck of Cards game:");
        playerClass.multiPlayer();
        playerClass.getCard();
        playerClass.shuffle();
    }
}
