package inflearn.section2_Array;

import java.util.Scanner;

public class _2_보이는_학생 {
    public int solution(int n, int[] intArr) {
        int answer = 1;
        int max = intArr[0];

        for (int i = 1; i < n; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArr = new int[n];

        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }

        _2_보이는_학생 T = new _2_보이는_학생();
        System.out.println(T.solution(n, intArr));
    }
}
