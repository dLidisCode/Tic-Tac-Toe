package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Table x = new Table();
        String move;
        Scanner in = new Scanner(System.in);
        int won=0 , draw;

        System.out.println("Please enter the column (A,B or C) and then the row (1,2 or 3) of your move. ");
        x.printTable();
        do {

            System.out.println("Player Move (X) :");
            move= in.nextLine();
            x.fillTable(move);
            x.printTable();

            won=x.wonGame();
            if(won==1) {
                System.out.println("YOU WON THE GAME");
                break;
            }else if(won==2) {
                System.out.println("COMPUTER WON THE GAME");
                break;
            }
            draw = x.draw();
            if(draw==9 && won==0) {
                System.out.println("The game is draw .");
                break;
            }
            System.out.println("Computer Move (O)");
            x.pcMove();
            x.printTable();
            won=x.wonGame();
            if(won==1) {
                System.out.println("YOU WON THE GAME");
                break;
            }else if(won==2) {
                System.out.println("COMPUTER WON THE GAME");
                break;
            }

        }while(won==0);



    }

}
