package Bai1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int cnt = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '(') 
                cnt++;
            else if (s.charAt(i) == ')' && cnt > 0) 
                cnt--;
            else if (s.charAt(i) == ')' && cnt == 0) 
                result++;
        
        result += cnt;
        System.out.println(result);
        
    }
}
