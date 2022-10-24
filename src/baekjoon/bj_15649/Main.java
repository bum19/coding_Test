package baekjoon.bj_15649;

import java.util.Scanner;

//N과 M 1번. 순열
//N개의 수중 M개를 골라 출력
public class Main {
    static int  N,M;
    static boolean[] visited;
    static int[] output;
    static StringBuilder sb = new StringBuilder();

    static void back(int dep){
        if(dep == M){
            for(int num : output){
                sb.append(num).append(" ");
            }
            sb.append('\n');
            return;
        }

        for(int i = 0 ; i < N; i++){
            if(!visited[i]){
                visited[i] = true;
                output[dep] = i+1;
                back(dep+1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visited = new boolean[N];
        output = new int[M];
        back(0);
        System.out.println(sb);
    }
}
