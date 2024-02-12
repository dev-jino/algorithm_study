package inflearn.section2_Array;

import java.util.Scanner;

public class _5_소수_에라토스테네스_체 {
    public int solution(int n) {
        int answer = 0;
        int[] nArr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (nArr[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) {
                    nArr[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        _5_소수_에라토스테네스_체 T = new _5_소수_에라토스테네스_체();
        System.out.println(T.solution(n));
    }
}
