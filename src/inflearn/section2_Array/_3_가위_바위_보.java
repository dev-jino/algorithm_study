package inflearn.section2_Array;

import java.util.Scanner;

public class _3_가위_바위_보 {
    public char[] solution(int n, int[] aArr, int[] bArr) {
        char[] answer = new char[n];

        for (int i = 0; i < n; i++) {
            if (aArr[i] == 1) {
                if (bArr[i] == 1) {
                    answer[i] = 'D';
                } else if (bArr[i] == 2) {
                    answer[i] = 'B';
                } else {
                    answer[i] = 'A';
                }
            } else if (aArr[i] == 2) {
                if (bArr[i] == 1) {
                    answer[i] = 'A';
                } else if (bArr[i] == 2) {
                    answer[i] = 'D';
                } else {
                    answer[i] = 'B';
                }
            } else if (aArr[i] == 3) {
                if (bArr[i] == 1) {
                    answer[i] = 'B';
                } else if (bArr[i] == 2) {
                    answer[i] = 'A';
                } else {
                    answer[i] = 'D';
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];
        int[] bArr = new int[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            bArr[i] = sc.nextInt();
        }

        _3_가위_바위_보 T = new _3_가위_바위_보();
        for (char c : T.solution(n, aArr, bArr)) {
            System.out.println(c);
        }
    }
}
