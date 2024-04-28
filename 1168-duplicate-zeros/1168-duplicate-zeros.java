class Solution {
    public void duplicateZeros(int[] arr) {
    int[] copyArray = arr.clone();

    int copyIndex = 0;
        
    for(int i = 0; i < arr.length; i++){

        if(copyArray[copyIndex] == 0 && i != arr.length -1){
                arr[i] = 0;
                i++;
                
                arr[i] = 0;
            }
            else{
                arr[i] = copyArray[copyIndex];
            }
            copyIndex++;
        }
        
    }
}