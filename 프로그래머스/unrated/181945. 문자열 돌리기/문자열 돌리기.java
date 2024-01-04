import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        int result = a.length();
        
        for(int i=0; i<result; i++) {
            
            System.out.println(a.charAt(i));
            
        }
    }
}