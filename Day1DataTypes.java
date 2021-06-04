import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        int in = scan.nextInt();
        double dou = scan.nextDouble();
        String st = "";
        
        //I dont know why scan.nextLine() didnt work so i had to do this
        while(scan.hasNextLine())
            st += scan.next() + " ";
        
        
        System.out.println(i + in);
        System.out.println(d + dou);
        System.out.println(s + st);

        scan.close();
    }
}
