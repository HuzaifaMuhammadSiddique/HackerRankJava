import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
  
        for(int i=0; i<q; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            
            int result = a;

            
            for(int j=0; j<n; j++){
                result = result + (int)(Math.pow(2.0,j) * b);
                System.out.print(result + " ");
            }
            
            System.out.println();
        }
}
}
