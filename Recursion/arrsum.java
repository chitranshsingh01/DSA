public class arrsum {
    public static void main(String[] args) {
        int[] arr={10,10,10,10,10,10,10,10,10,10};
        int index=arr.length-1;
        System.out.println(arrsum(arr,index));

    }
    public static int arrsum(int[] arr,int index){
        if(index==-1) return 0;
        return arr[index]+arrsum(arr,index-1);
    } 
}
 