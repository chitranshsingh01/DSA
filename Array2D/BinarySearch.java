public class BinarySearch {
    public static void main(String[] args) {
        int [][] matrix=new int[5][5];
        int target =5;
         int rows=matrix.length;
        int cols=matrix[0].length;
        int l=0;
        int r=(rows*cols)-1;
        int mid;
        while(l<=r){
            mid=l+(r-l)/2;
            int midrow=mid/cols;
            int midcol=mid%cols;
            if(matrix[midrow][midcol]==target) {
                System.out.println(midrow+midcol+"is the index");
            }
            else if(matrix[midrow][midcol]<target) {
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
    }
    
}
