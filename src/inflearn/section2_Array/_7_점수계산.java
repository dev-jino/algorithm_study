package inflearn.section2_Array;

import java.util.Scanner;

public class _7_점수계산 {
    public int solution(int n, int[] nArr) {
        int answer = 0;
        int point = 1;

        if (nArr[0] == 1) {
            answer += point;
        }

        for (int i = 1; i < n; i++) {
            if (nArr[i - 1] == 1) {
                point++;
            }

            if (nArr[i] == 1) {
                answer += point;
            } else {
                point = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];

        for (int i =0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        _7_점수계산 T = new _7_점수계산();
        System.out.println(T.solution(n, nArr));
    }
}
