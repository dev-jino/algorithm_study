package inflearn.section2_Array;

import java.util.Scanner;

public class _4_피보나치_수열 {
    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        _4_피보나치_수열 T = new _4_피보나치_수열();
        for (int i : T.solution(n)) {
            System.out.print(i + " ");
        }
    }
}
