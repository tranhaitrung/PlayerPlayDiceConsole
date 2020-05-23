package Tuan1;

import java.util.Random;
import java.util.Scanner;

public class RealPlayer extends  Player{
    public RealPlayer (String name, int score){
        super(name, score);
    }

    public int scores (int k){
        return score+k;
    }


    public void chat(String c){
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

}
