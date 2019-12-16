import java.util.*;
public class Q2{
    public static void main(String [] args){
         int[][] ratings = {{4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7}};
    System.out.println(reviewerAvgRating(ratings, 0));
    }

    public static int reviewerAvgRating(int[][] ratings, int reviewer){
        int ans = 0;
        for (int i = 0; i<ratings[reviewer].length; i++){
            ans += ratings[reviewer][i];
        }
        int a = ans/ratings[reviewer].length;
        return a;
    }
}