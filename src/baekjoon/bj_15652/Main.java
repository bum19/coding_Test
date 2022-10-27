package baekjoon.bj_15652;
//N과M 4번
//중복을 허용하는 조합. 오름차순으로

import java.util.Scanner;

public class Main {
    static int[] output;
    static int n,m;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        output = new int[m];

        dfs(0,0);
        System.out.println(sb);
    }

    static void dfs(int dep, int p){
        if(dep == m){
            for(int num: output){
                sb.append(num).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = p; i < n; i++){
            output[dep] = i+1;
            dfs(dep+1, i);
        }
    }
}
