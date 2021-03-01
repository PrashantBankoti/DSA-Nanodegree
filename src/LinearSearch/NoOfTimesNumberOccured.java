package LinearSearch;

public class NoOfTimesNumberOccured {
    public static int search(int[] arr,int item){
        int len= arr.length;
        int counter=0;
        for(int i=0;i<len;i++){
            if(arr[i]==item){
                counter++;
            }
        }
        return counter;

    }


    public static void main(String[] args) {
        int[] arr={10,20,20,30,10,10,20,80,30};
        int item=7;
        int result= search(arr,item);
        if(result==0){
            System.out.println("The item is not present in the array.");
        }else{
            System.out.println("The Number "+item+" is occurred "+result+" times." );
        }
    }
}
