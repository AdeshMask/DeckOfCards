package com.bridgelabz;

import java.util.Scanner;

public class PlayerClass {

    Scanner scanner = new Scanner(System.in);

    public void multiPlayer() {
        System.out.println("Eneter number of Players:");
        int n = scanner.nextInt();
        if (n > 1 && n <=4 ){
            System.out.println();
            sequenceofPlayers(n);
        }
        else {
            System.out.println("Enter Players between 2 and 4:");
            multiPlayer();
        }

    }

    private void sequenceofPlayers(int n) {
        System.out.println("Distribuiting the cards to the player as follows..");
        for (int i = 0;i < n; i++){
            System.out.println("Player "+(i+1)+ " Play ");
        }
    }
}
