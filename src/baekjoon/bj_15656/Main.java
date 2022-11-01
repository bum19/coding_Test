package baekjoon.bj_15656;

import java.util.Scanner;
import java.util.Arrays;
//중복을 허용하는 순열
//N개의 수 중 M개 고르기
public class Main {
    static int n,m;
    static int[] input;
    static int[] output;
    static StringBuilder sb = new StringBuilder();
    public static void back(int dep){
        if(dep == m){
            for(int i =0 ; i< m; i++){
                sb.append(output[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = 0; i< n; i++){
            output[dep] = input[i];
            back(dep+1);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        input = new int[n];
        output = new int[m];
        for(int i = 0 ; i < n; i++){
            input[i] = sc.nextInt();
        }
        Arrays.sort(input);

        back(0);
        System.out.println(sb);
    }
}
