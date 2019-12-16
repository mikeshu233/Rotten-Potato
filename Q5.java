import java.util.*;
public class Q5{
    public static void main(String [] args){
         int[][] ratings = {{4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7}};
    System.out.println(worstMovie2018(ratings));
    }

    public static int worstMovie2018(int[][] ratings){
        int abc = 0;
        int abcd = 1;
        int abcde = 2;
        int abcdef = 3;
        int ans = 0;
        int ans1 = 0; 
        int ans2 = 0;
        int ans3 = 0;
        for (int i = 0; i<ratings.length; i++){
            ans += ratings[i][0];
            ans1 += ratings[i][1];
            ans2 += ratings[i][2];
            ans3 += ratings[i][3];
        }
        int a = ans/ratings.length;
        int b = ans1/ratings.length;
        int c = ans2/ratings.length;
        int d = ans3/ratings.length;
        if (a<b&&a<c&&a<d){
            return abc;
        }else if (b<a&&b<c&&b<d){
            return abcd;
        }else if (c<a&&c<b&&c<d){
            return abcde;
        }else if (d<a&&d<b&&d<c){
            return abcdef;
        }return abc;
    }
}