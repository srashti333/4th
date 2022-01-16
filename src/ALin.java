public class ALin {
    public static void main(String[] args) {
        int arr[]={10,20,30,400,50};
        int index=1;
        int value =100;
        for(int i=arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=value;
    }
}
