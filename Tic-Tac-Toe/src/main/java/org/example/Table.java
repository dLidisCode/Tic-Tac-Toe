package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class Table {
    private static final boolean TRUE = false;
    private int rows=3;
    private int columns=3;
    private char [][]board = new char[rows][columns];


    public Table() {
        // ���� ������������ ���������� ��� ������ �� �� ���� .
        for(int i = 0 ; i < rows ; i ++) {
            for(int y = 0 ; y <  columns ; y ++) {
                board[i][y]=' ';
            }
        }

    }

    public void printTable() {
        // ������� � ����� ��������� ��� ��� ������ .


        System.out.println("    A  B  C ");
        System.out.println(" 1|"+board[0][0] + " | " +board[0][1]+ "| "+board[0][2]+"|" );
        System.out.println(" 2|"+board[1][0] + " | " +board[1][1]+ "| "+board[1][2]+"|" );
        System.out.println(" 3|"+board[2][0] + " | " +board[2][1]+ "| "+board[2][2]+"|" );


    }

    public void fillTable(String aMove) {

        /** ������� � ����� ������� ��� ��������� ����� String � ����� �������� ��� ������ ��� ������ . ��� ������ �� char
         *  ��� ��� ���� �� ���� ������������ ������ move . ������� �� ��� ������� ������ ��� ������ board . �� ��������� ���
         *  � ������� ���� �������� ���� ���� ��� ��� ����� � ������� ���� ������� ��������� ������ . ��� ��� ��� �����
         *  ������ ���� ������� ���� ��������� ������ .
         */


        String secondMove;
        Scanner in = new Scanner(System.in);
        int rightMove=0;



        char[] move = aMove.toCharArray();
        if(move[0]=='A'&& move[1]=='1') {

            if(board[0][0]==' ') {
                board[0][0]= 'X';
                rightMove=1;
            }else System.out.println("The space entered is already taken ." );
        }
        if(move[0]=='A'&& move[1]=='2') {

            if(board[1][0]==' ') {
                board[1][0]= 'X';
                rightMove=1;
            }else System.out.println("The space entered is already taken ." );
        }
        if(move[0]=='A'&& move[1]=='3') {

            if(board[2][0]==' ') {
                board[2][0]= 'X';
                rightMove=1;
            }else System.out.println("The space entered is already taken ." );
        }
        if(move[0]=='B'&& move[1]=='1') {

            if(board[0][1]==' ') {
                board[0][1]= 'X';
                rightMove=1;
            }else System.out.println("The space entered is already taken ." );
        }
        if(move[0]=='B'&& move[1]=='2') {

            if(board[1][1]==' ') {
                board[1][1]= 'X';
                rightMove=1;
            }else System.out.println("The space entered is already taken ." );
        }
        if(move[0]=='B'&& move[1]=='3') {

            if(board[2][1]==' ') {
                board[2][1]= 'X';
                rightMove=1;
            }else System.out.println("The space entered is already taken ." );
        }
        if(move[0]=='C'&& move[1]=='1') {

            if(board[0][2]==' ') {
                board[0][2]= 'X';
                rightMove=1;
            }else System.out.println("The space entered is already taken ." );
        }
        if(move[0]=='C'&& move[1]=='2') {

            if(board[1][2]==' ') {
                board[1][2]= 'X';
                rightMove=1;
            }else System.out.println("The space entered is already taken ." );
        }
        if(move[0]=='C'&& move[1]=='3') {

            if(board[2][2]==' ') {
                board[2][2]= 'X';
                rightMove=1;
            }else System.out.println("The space entered is already taken ." );
        }
        if(rightMove==0) {
            System.out.println("Invalid Input: Please enter the column and the row of our move (Example: A1)");
            secondMove = in.nextLine();
            fillTable(secondMove);

        }

    }

    public int wonGame() {
        /** ������� ���� ����� ������ ���� ������� ����� ���� ��� ������ ���� ��� ���������� . ���������� ��� ���� int .
         * ���� � ���� ����� 0 �������� ��� ��� ���� �������� ������� ��� ���� ��� . ���� � ���� ����� 1 �������� � �������
         * ��� ���� ����� 2 �������� � ����������� .
         */
        int x=0;

        if((board[0][0]=='X')&&(board[1][0]=='X')&&(board[2][0]=='X')) {
            x=1 ;
        }
        if((board[0][1]=='X')&&(board[1][1]=='X')&&(board[2][1]=='X')) {
            x=1 ;
        }
        if((board[0][2]=='X')&&(board[1][2]=='X')&&(board[2][2]=='X')) {
            x=1 ;
        }
        if((board[0][0]=='X')&&(board[0][1]=='X')&&(board[0][2]=='X')) {
            x=1 ;
        }
        if((board[1][0]=='X')&&(board[1][1]=='X')&&(board[1][2]=='X')) {
            x=1 ;
        }
        if((board[2][0]=='X')&&(board[2][1]=='X')&&(board[2][2]=='X')) {
            x=1 ;
        }
        if((board[0][0]=='X')&&(board[1][1]=='X')&&(board[2][2]=='X')) {
            x=1 ;
        }
        if((board[0][2]=='X')&&(board[1][1]=='X')&&(board[2][0]=='X')) {
            x=1 ;
        }



        if((board[0][0]=='O')&&(board[1][0]=='O')&&(board[2][0]=='O')) {
            x=2 ;
        }
        if((board[0][1]=='O')&&(board[1][1]=='O')&&(board[2][1]=='O')) {
            x=2 ;
        }
        if((board[0][2]=='O')&&(board[1][2]=='O')&&(board[2][2]=='O')) {
            x=2 ;
        }
        if((board[0][0]=='O')&&(board[0][1]=='O')&&(board[0][2]=='O')) {
            x=2 ;
        }
        if((board[1][0]=='O')&&(board[1][1]=='O')&&(board[1][2]=='O')) {
            x=2 ;
        }
        if((board[2][0]=='O')&&(board[2][1]=='O')&&(board[2][2]=='O')) {
            x=2 ;
        }
        if((board[0][0]=='O')&&(board[1][1]=='O')&&(board[2][2]=='O')) {
            x=2 ;
        }
        if((board[0][2]=='O')&&(board[1][1]=='O')&&(board[2][0]=='O')) {
            x=2 ;
        }
        return x;
    }

    public void pcMove() {


        Random rn = new Random();

        int randomNum = rn.nextInt(8) ;

        if(randomNum==0) {
            if(board[0][0]==' ') {
                board[0][0]='O';
            }else {
                pcMove();
            }
        }else if (randomNum==1) {
            if(board[0][1]==' ') {
                board[0][1]='O';
            }else {
                pcMove();
            }
        }else if (randomNum==2) {
            if(board[0][2]==' ') {
                board[0][2]='O';
            }else {
                pcMove();
            }
        }else if (randomNum==3) {
            if(board[1][0]==' ') {
                board[1][0]='O';
            }else {
                pcMove();
            }
        }else if (randomNum==4) {
            if(board[1][1]==' ') {
                board[1][1]='O';
            }else {
                pcMove();
            }
        }else if (randomNum==5) {
            if(board[1][2]==' ') {
                board[1][2]='O';
            }else {
                pcMove();
            }
        }else if (randomNum==6) {
            if(board[2][0]==' ') {
                board[2][0]='O';
            }else {
                pcMove();
            }
        }else if (randomNum==7) {
            if(board[2][1]==' ') {
                board[2][1]='O';
            }else {
                pcMove();
            }
        }else if (randomNum==8) {
            if(board[2][2]==' ') {
                board[2][2]='O';
            }else {
                pcMove();
            }
        }
    }


    public int draw() {

        int sum = 0;
        for(int i = 0 ; i < rows ; i ++) {
            for(int y = 0 ; y <  columns ; y ++) {
                if(board[i][y]!=' ') {
                    sum++;
                }
            }
        }
        return sum;
    }


}











