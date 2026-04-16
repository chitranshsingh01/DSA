public class linearsearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,89,9};
        System.out.println(exists(arr,99,0));
    }
    public static boolean exists(int[] arr,int element,int index){
        if(index==arr.length) return false;
        if(arr[index]==element) return true;
        return exists(arr,element,index+1);
    }
}
