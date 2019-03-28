public void InsertSort(int[] nums){
   for(int i = 1; i < nums.length; i++){
      int temp = nums[i];
      int j;
      for(j = i - 1; j >= 0; j--){
         if(nums[j] > temp){
            nums[j + 1]=nums[j];
         }else{
          break;
         }
      }
      nums[j + 1] = temp;
   }
}

/*
时间复杂度：O(n^2)
空间复杂度：O(1)
*/
