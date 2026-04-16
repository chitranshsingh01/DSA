package Array2D;

public class work {
    public static void main(String[] args) {
         int[][] ans={{1,2,3},{4,5,6},{7,8,9}};
          for (int i = 0; i <ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j]=ans[j][i];
            }  
        }

    }
    
}
