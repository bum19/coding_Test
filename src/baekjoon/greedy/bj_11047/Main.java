package baekjoon.greedy.bj_11047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, K, minCoinNum = 0;
        int[] coinKinds;

        N = sc.nextInt();
        K = sc.nextInt();
        coinKinds = new int[N];


        for(int i =0 ; i< N; i++)
            coinKinds[i] = sc.nextInt();

        for(int i = N-1 ; i>=0 ; i--){
            minCoinNum += K/coinKinds[i];
            K %= coinKinds[i];
        }

        System.out.println(minCoinNum);
    }
}
