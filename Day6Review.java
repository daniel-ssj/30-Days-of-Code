import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        
        while(N > 0){
            String s = in.nextLine();
            
            for(int i = 0; i < s.toCharArray().length; i++){
                if(i % 2 == 0) System.out.print(s.charAt(i));
            }
            
            System.out.print(" ");
            
            for(int i = 0; i < s.toCharArray().length; i++){
                if(i % 2 != 0) System.out.print(s.charAt(i));
            }
            
            System.out.println();
            N--;
        }
        
    }
}
