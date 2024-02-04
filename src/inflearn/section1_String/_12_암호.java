package inflearn.section1_String;

import java.util.Scanner;

public class _12_암호 {
    public String solution(int n, String str) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            String temp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(temp, 2);
            answer += (char)num;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        _12_암호 T = new _12_암호();
        System.out.println(T.solution(n, str));
    }
}
