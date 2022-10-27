package baekjoon.bj_15651;
//N과 M 3번
//중복을 허용하는 N과 M 순열
import java.util.Scanner;
public class Main {
    static int[] output;
    static int n, m;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        output = new int[m];
        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int dep){
        if(dep == m){
            for(int num: output){
                sb.append(num).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = 0; i< n; i++){
            output[dep] = i+1;
            dfs(dep+1);
        }

    }
}
