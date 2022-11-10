package baekjoon.bj_15657;

import java.util.Arrays;
import java.util.Scanner;

//N과 M 8번
//중복을 허용하는 조합.
public class Main {
    static int N,M;
    static int[] input;
    static int[] output;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        input = new int[N];
        output = new int[M];

        for(int i = 0; i< N; i++)
            input[i] = sc.nextInt();
        Arrays.sort(input);

        dfs(0,0);
        System.out.println(sb);
    }
    static void dfs(int dep, int p){
        if(dep == M){
            for(int i = 0 ; i < M; i++) {
                sb.append(output[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = p; i < N; i++){
            output[dep] = input[i];
            dfs(dep+1, i);
        }
        return;
    }

}
