package Tuan1;

import java.util.Random;

public class Arbitrator {
    public int specify(){
        int []a = {1,2,3,4};
        Random  random = new Random();
        return a[random.nextInt(a.length)];
    }

    public int sumScore(Player player, int s){

        player.score = player.score + s;
        if(player.score >21) return 0;
        else if (player.score <21) return player.score;
        else {
            return 21;
        }
    }
}
