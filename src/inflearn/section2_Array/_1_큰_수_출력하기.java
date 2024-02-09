package inflearn.section2_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class _1_큰_수_출력하기 {
    public ArrayList<Integer> solution(int n, int[] intArr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                answer.add(intArr[i]);
                continue;
            }

            if (intArr[i - 1] < intArr[i]) {
                answer.add(intArr[i]);
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

        _1_큰_수_출력하기 T = new _1_큰_수_출력하기();
        for (int x : T.solution(n, intArr)) {
            System.out.print(x + " ");
        }
    }
}
