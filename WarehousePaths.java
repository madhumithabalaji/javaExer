import java.util.*;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nrow = scan.nextInt();
        int ncolumn = scan.nextInt();
        int input[][] = new int[nrow][ncolumn];
        for(int r=0;r<nrow;r++)
        {
            for(int c=0;c<ncolumn;c++)
            {
                input[r][c] = scan.nextInt();
            }
        }
        scan.close();
        recurseFunc(input);
    }
    
    public static void recurseFunc(int[][] matrix){
        ArrayList<Integer> npath = new ArrayList<Integer>();
        List<Integer> res = findPath(matrix, 0, 0, npath);
        double result = res.size() % (Math.pow(10, 9)+7);
        System.out.println(Math.round(result));
    }
    
    public static List<Integer> findPath(int[][] matrix, int r, int c, List<Integer> npath){
        int i=0;
        if (c+1 < matrix[0].length && matrix[r][c+1] == 1)
        {
            findPath(matrix, r, c+1, npath);
        }
        if (r+1 < matrix.length && matrix[r+1][c]==1)
        {
           findPath(matrix, r+1, c, npath);
        }
        if( r == matrix.length-1 && c == matrix[0].length-1)
        {
            npath.add(i++);
        }
        return npath;
        }
}
