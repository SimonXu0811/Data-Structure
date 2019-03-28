public void SelectSort(int[] nums){
   int min;
   for(int i = 0; i < nums.length; i++){
      int index = i;
      for(int j = i; j < nums.length; j++){
         if(nums[index] > nums[j]){
           index = j;
         }
      }
      if(i != index){
        min = nums[index];
        nums[index] = nums[j];
        nums[j] = min;
      }
   }
}


/*
时间复杂度为：O(n^2)
空间复杂度为：O(1)
*/
