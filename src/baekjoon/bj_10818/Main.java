package baekjoon.bj_10818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int maxNum = -1000000;
        int minNum = 1000000;
        int temp;
        for(int i=0;i<N;i++){
            temp = sc.nextInt();
            maxNum = Math.max(maxNum, temp);
            minNum = Math.min(minNum, temp);
        }


        System.out.println(minNum+" "+maxNum);

    }
}
