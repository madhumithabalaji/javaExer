import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int res = 0;
        int i = scan.nextInt();
        String prev = "" + i;
        while(scan.hasNext()){
                    int current = scan.nextInt();
                    res = res + current + i;
                    i =0;
                    prev = strAdd(current, prev);
                    System.out.println(prev +"=" +res);
        }
    }
    public static String strAdd(int current, String prev){
        String resStr = prev +"+"+current;
        return resStr;
    }
}
