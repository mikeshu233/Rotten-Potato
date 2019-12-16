import java.util.*;
public class Q3{
    public static void main(String [] args){
         int[][] ratings = {{4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7}};
    System.out.println(avgRating2018(ratings));
    }

    public static int avgRating2018(int[][] ratings){
        int ans = 0;
        int ans1 = 1; 
        int ans2 = 2;
        for (int i = 0; i<ratings[0].length; i++){
            ans += ratings[0][i];
            ans1 += ratings[1][i];
            ans2 += ratings[2][i];
        }
        int a = (ans+ans1+ans2)/(3*ratings[0].length);
        return a;
    }
}