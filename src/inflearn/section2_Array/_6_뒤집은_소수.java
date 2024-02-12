package inflearn.section2_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class _6_뒤집은_소수 {
    public boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public ArrayList<Integer> solution(int n, int[] nArr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int temp = nArr[i];
            int res = 0;
            while (temp > 0) {
                int t = temp % 10;
                res = 10 * res + t;
                temp = temp / 10;
            }
            if (isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;
    }

    public ArrayList<Integer> solution_2(int n, int[] nArr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
//            String str = Integer.toString(nArr[i]);
            String str = String.valueOf(nArr[i]);
            int temp = Integer.parseInt(new StringBuffer(str).reverse().toString());
            if (isPrime(temp)) {
                answer.add(temp);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        _6_뒤집은_소수 T = new _6_뒤집은_소수();
        for (int i : T.solution(n, nArr)) {
            System.out.print(i + " ");
        }
    }

}
