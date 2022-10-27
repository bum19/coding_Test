package baekjoon.bj_15650;
//N과 M 2번
//조합. 중복없이 N개중 M개 고르기
import java.util.Scanner;
public class Main {
    static int[] output;
  //  static boolean[] visited; 어차피 재귀로 불러온함수는 호출한곳보다 큰수만 접근가능하므로 필요없다.
    static int n, m;
    static StringBuilder sb = new StringBuilder();

    public static void back(int dep, int p){
        if(dep == m){
            for(int num : output){
                sb.append(num).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = p; i< n; i++){
            output[dep] = i+1;
            back(dep+1, i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        output = new int[m];
        back(0,0);
        System.out.println(sb);
    }
}
