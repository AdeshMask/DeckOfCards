package com.bridgelabz;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static com.bridgelabz.DeckOfCards.*;

public class PlayerClass {

    public static final String[] SUIT = {"Clubs", "Diamond","Heart","Spades"};
    public static final String[] RANK = {"2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King", "Ace"};

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void multiPlayer() {
        System.out.println("Eneter number of Players:");
        int player = scanner.nextInt();
        if (player > 1 && player <=4 ){
            System.out.println();
            sequenceofPlayers(player);
        }
        else {
            System.out.println("Enter Players between 2 and 4:");
            multiPlayer();
        }
    }

    private void sequenceofPlayers(int player) {
        System.out.println("Distribuiting the cards to the player as follows..");
        for (int i = 0;i < player; i++){
            System.out.println("Player "+(i+1)+ " Play ");
        }
    }

        void getCard() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
               list.add(SUIT[i]+ " "+ RANK[j]);
            }
        }
    }

    void shuffle(){
        for (int i = 0; i < TOTAL_CARDS; i++){
            int randomCard = random.nextInt(list.size());
            String card = list.get(randomCard);
            System.out.println(card);
        }
    }
}
