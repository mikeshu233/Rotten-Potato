import java.util.*;
public class Q4{
    public static void main(String [] args){
         int[][] ratings = {{4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7}};
    System.out.println(hardestRater2018(ratings));
    }

    public static int hardestRater2018(int[][] ratings){
        int abc = 0;
        int abcd = 1;
        int abcde = 2;
        int ans = 0;
        int ans1 = 0; 
        int ans2 = 0;
        for (int i = 0; i<ratings[0].length; i++){
            ans += ratings[0][i];
            ans1 += ratings[1][i];
            ans2 += ratings[2][i];
        }
        int a = ans/ratings[0].length;
        int b = ans1/ratings[0].length;
        int c = ans2/ratings[0].length;
        if (a<b&&a<c){
            return abc;
        }else if (b<a&&b<c){
            return abcd;
        }else if (c<a&&c<b){
            return abcde;
        } return abc;
    }
}