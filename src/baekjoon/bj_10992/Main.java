package baekjoon.bj_10992;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        //0~N-1줄의 별 출력
        //i번째 줄에서 별은 ( N-1 +- i )위치에 찍힘
        for(int i = 0; i < N; i++){
            for(int j = 0 ; j < N+i; j++) {
                if (i == N - 1 || j == N + i - 1 || j == N - i - 1)
                    sb.append("*");
                else
                    sb.append(" ");
            }
            sb.append('\n');
        }

        System.out.println(sb.toString());
    }
}
