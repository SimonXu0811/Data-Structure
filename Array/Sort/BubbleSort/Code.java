public void BubbleSort (int[] nums){
   for(int i = 0; i < nums.length - 1; i++){
   //外层循环控制内层循环循环的长度，这边时间占用T（n）
      for(int j = 0; j < nums.length - 1 - i; j++){
      // 内层循环作为交换的索引，这里时间占用为T（n/2）
        if(nums[j]>nums[j + 1]){
          swap(nums[j],nums[j + 1]);
        }
      }
   }
}

public void swap(int a,int b){
   int temp = a;
   a = b;
   b = a;
}

/*
时间复杂度：O（n^2）
空间复杂度：O（1）
*/
