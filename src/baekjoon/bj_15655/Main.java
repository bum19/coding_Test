package baekjoon.bj_15655;
//N과M 6번
//중복허용않는 조합

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] input;
    static int[] output;
    static int n,m;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        input = new int[n];
        output = new int[m];
        for(int i =0 ; i<n; i++)
            input[i] = sc.nextInt();
        Arrays.sort(input);
        dfs(0,0);
        System.out.println(sb);
    }

    static void dfs(int dep,int p){
        if(dep == m){
            for(int num : output){
                sb.append(num).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i =p ; i < n; i++){
                output[dep] = input[i];
                dfs(dep+1, i+1);
            }
    }
}

