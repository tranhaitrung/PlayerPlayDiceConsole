package Tuan1;

import java.util.Random;

public class Dice {
    private int [][]dice ={{1,1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6},
                    {1,1,1,1,2,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6},
                    {1,1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6},
                    {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,6,6,6,6}};

    private int soccerForPlayer;
    public Dice(){

    }

    public Dice(int soccerForPlayer) {
        this.soccerForPlayer = soccerForPlayer;
    }

    public int pourDice (int n){
        Random random = new Random();
        return dice[n][random.nextInt(25)];
    }

}
