package inflearn.section1_String;

import java.util.ArrayList;
import java.util.Scanner;

public class _4_단어_뒤집기 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String s : str) {
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public ArrayList<String> solution_2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String s : str) {
            char[] c = s.toCharArray();
            int lt = 0;
            int rt = s.length() - 1;

            while (lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(c);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        _4_단어_뒤집기 T = new _4_단어_뒤집기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        for (String s : T.solution_2(n, str)) {
            System.out.println(s);
        }

    }
}
