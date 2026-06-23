import java.util.*;
public class celebrityproblem{
    public static void main(String[] args) {
        int[][] matrix={
            {1,1,0},
            {0,1,0},
            {0,1,1}
        };
        Stack<Integer> st=new Stack<>();
        int n=matrix.length;
        for (int i = 0; i <n; i++) {
            st.push(i);   
        }

        while(st.size()>1){
            int a=st.pop();
            int b=st.pop();
            boolean aflag=true;
            boolean bflag=true;
            if(matrix[a][b]==1) aflag=false;
            else bflag=false;
            if(matrix[b][a]==1) bflag=false;
            else aflag=false;

            if (aflag) st.push(a);
            if(bflag) st.push(b);
        }
        if(st.size()==0) System.out.println("no celebrity");
        int celeb =st.pop();
        for(int j=0; j<n ; j++){
            if(j==celeb) continue;
            if(matrix[celeb][j]==1) System.out.println("no celebrity");
        }
          for(int i=0; i<n ; i++){
            if(i==celeb) continue;
            if(matrix[i][celeb]==0  ) System.out.println("no celebrity");
        }

        System.out.println(celeb+" is the celebrity");

    }
}