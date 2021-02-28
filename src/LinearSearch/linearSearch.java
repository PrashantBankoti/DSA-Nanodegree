package LinearSearch;


public class linearSearch {
    public static int search(int[] arr, int item){
    int len= arr.length;
    for (int i=0;i<len;i++){
        if(arr[i]==item)
            return i;
    }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr={1,10,12,50,44,9,2};
        int item=1;
        int result = search(arr,item);

        if( result==-1){
            System.out.print("The item is not present in the array");

        }else{
            System.out.println("The "+item+" is present at index "+result);
        }
    }
}
