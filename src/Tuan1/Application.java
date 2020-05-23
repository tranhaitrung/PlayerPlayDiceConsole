package Tuan1;

import java.util.Random;
import java.util.Scanner;


public class Application {


    public static void addRealPlayerInf(Player player) {
        System.out.printf("Nhập tên người chơi: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        player.setName(name);


    }

    public static void addVituralPlayerInf(Player player, int sttAo) {
        String tmp = "Người chơi ảo " + sttAo;
        player.setName(tmp);
    }

    public static void printInforPlayer(Player[] listPlayer) {
        for (int i = 0; i < 4; i++) {
            System.out.println(i + 1 + ". " + listPlayer[i].getName());
        }
    }

    public static void main(String[] args) {
        int n = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số người tham gia: ");
        n = scanner.nextInt();
        while (n > 4 || n <= 0) {
            if (n > 4) {
                System.out.println("Trò chơi của chúng tôi chỉ hỗ trợ tối đa 4 người.");
            }
            if (n <= 0) {
                System.out.println("Số người chơi không hợp lệ!!! ");
            }
            System.out.print("vui lòng nhập lại số người chơi: ");
            n = scanner.nextInt();
        }

        Player[] list = new Player[4];

        for (int i = 0; i < n; i++) {
            list[i] = new Player();
            addRealPlayerInf(list[i]);
        }

        if (n < 4) {
            for (int i = n; i < 4; i++) {
                list[i] = new Player();
                addVituralPlayerInf(list[i], (i - n + 1));
            }
        }
        System.out.println("Thông tin người chơi: ");
        printInforPlayer(list);

        


//        RealPlayer p1 = new RealPlayer("Trung",0);
//        RealPlayer p2 = new RealPlayer("Huy",0);
//        RealPlayer p3 = new RealPlayer("Phan",0);
//        RealPlayer p4 = new RealPlayer("Phiên",0);
//
//        int arr[] = {0,1,2,3};
//        Random random = new Random();
//
//        Dice dice = new Dice();
//
//        Arbitrator arbitrator = new Arbitrator();
//
//        //System.out.printf("Người chơi đầu tiên: "+arbitrator.specify());
//
//
//        while (p1.score!=21 && p2.score!=21 && p3.score!=21 && p4.score!=21){
//            int n;
//
//            System.out.println("Người chơi đầu tiên: " +p1.getName());
////            System.out.printf("chọn quân xúc xắc: " );
////            n = scanner.nextInt();
//            System.out.printf("Điểm reo được: ");
//            int k = dice.pourDice(arr[random.nextInt(arr.length)]);
//            System.out.println(""+k);
//            p1.score = arbitrator.sumScore(p1,k);
//            System.out.println("Tổng điểm: " +p1.score);
//            System.out.println("===================================================");
//            System.out.println("\n");
//            if(p1.score==21){
//                System.out.println("Người chiến thắng: "+p1.getName());
//                break;
//            }
//
//            System.out.println("Người chơi tiếp theo: " +p2.getName());
////            System.out.printf("chọn quân xúc xắc: " );
////            n = scanner.nextInt();
//            System.out.printf("Điểm reo được: ");
//            k = dice.pourDice(arr[random.nextInt(arr.length)]);
//            System.out.println(""+k);
//            p2.score = arbitrator.sumScore(p2,k);
//            System.out.println("Tổng điểm: " +p2.score);
//            System.out.println("===================================================");
//            System.out.println("\n");
//            if(p2.score==21){
//                System.out.println("Người chiến thắng: "+p2.getName());
//                break;
//            }
//
//            System.out.println("Người chơi tiếp theo: " +p3.getName());
////            System.out.printf("chọn quân xúc xắc: " );
////            n = scanner.nextInt();
//            System.out.printf("Điểm reo được: ");
//            k = dice.pourDice(arr[random.nextInt(arr.length)]);
//            System.out.println(""+k);
//            p1.score = arbitrator.sumScore(p3,k);
//            System.out.println("Tổng điểm: " +p3.score);
//            System.out.println("===================================================");
//            System.out.println("\n");
//            if(p3.score==21){
//                System.out.println("Người chiến thắng: "+p3.getName());
//                break;
//            }
//
//            System.out.println("Người chơi tiếp theo: " +p4.getName());
////            System.out.printf("chọn quân xúc xắc: " );
////            n = scanner.nextInt();
//            System.out.printf("Điểm reo được: ");
//            k = dice.pourDice(arr[random.nextInt(arr.length)]);
//            System.out.println(""+k);
//            p4.score = arbitrator.sumScore(p4,k);
//            System.out.println("Tổng điểm: " +p4.score);
//            System.out.println("===================================================");
//            System.out.println("\n");
//            if(p4.score==21){
//                System.out.println("Người chiến thắng: "+p4.getName());
//                break;
//            }
//
//
//        }
//

    }
}
