package baekjoon.bj_15654;

import java.util.Scanner;
import java.util.Arrays;
//N과 M 5번
//N개의 수로 M개 조합
public class Main {
    static int[] input;
    static boolean[] visited;
    static int[] output;
    static int n,m;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        input = new int[n];
        visited = new boolean[n];
        output = new int[m];
        for(int i =0 ; i<n; i++)
            input[i] = sc.nextInt();
        Arrays.sort(input);
        dfs(0);
        System.out.println(sb);
    }

    static void dfs(int dep){
        if(dep == m){
            for(int num : output){
                sb.append(num).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i =0 ; i < n; i++){
            if(!visited[i]){
                visited[i] = true;
                output[dep] = input[i];
                dfs(dep+1);
                visited[i] = false;
            }
        }
    }
}
