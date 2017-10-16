package com.example;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(highScore);

        score = 80;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(highScore);

        displayHighScorePosition("player1", score);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int score){
        int printScore = calculateHighScorePosition(score);
        System.out.println(playerName + " managed to get into position " + printScore + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000) return 1;
        if (score >= 500 && score < 1000) return 2;
        if (score >= 100 && score < 500) return 3;
        else return 4;
    }
}
