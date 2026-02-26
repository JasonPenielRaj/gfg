class Solution {
    void pushZerosToEnd(int[] arr) {
        int insertpos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[insertpos];
                arr[insertpos]=temp;
                insertpos++;
            }
        }
        
    }
}
