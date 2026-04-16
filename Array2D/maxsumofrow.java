package Array2D;

public class maxsumofrow {
    public static void main(String[] args) {
         int[][] arr={{10,10,10},{4,5,6},{7,8,9}};
         int sum=0;
         int max=0;
         int row=-1;

         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum+=arr[i][j];
            }
            max=Math.max(max, sum);
            if(max==sum){
                row=i;
            }
            sum=0;

        }
        System.out.println(max);
        System.out.println(row);

    }
    
}
