import java.util.*;
public class Q1{
    public static void main(String [] args){
         int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };
    System.out.println(movieAvgRating(ratings, 1));
    }

    public static int movieAvgRating(int[][] ratings, int movie){
        int ans = 0;
        for (int i = 0; i<ratings.length; i++){
            ans += ratings[i][movie];
        }
        int a = ans/ratings.length;
        return a;
    }
}
