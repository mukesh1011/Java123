package com.company;

public class Main {

    public static void main(String[] args) {

        int highScoore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScoore);
        highScoore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScoore);

        int player1 = calculateHighScorePosition(1500);
        displayHighScoprePosition("John", player1 );
        int player2 = calculateHighScorePosition(900);
        displayHighScoprePosition("Sean", player2 );
        int player3 = calculateHighScorePosition(400);
        displayHighScoprePosition("Kevin", player3 );
        int player4 = calculateHighScorePosition(50);
        displayHighScoprePosition("Cormac", player4 );


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }



    public static void displayHighScoprePosition(String name1, int position){
        System.out.println(name1 + " managed to get position " + position + " on the high score table");
    }
    public static int calculateHighScorePosition (int score){
        if (score > 1000){
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}
