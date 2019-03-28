public void QuickSort(int [] nums, int start, int end){
   int temp = nums[start];
   
   while(start < end){
     
     while(start < end && nums[end] >= temp){//从后向前遍历，找到第一个比目标值小的数
             --end;
     }
     if( start >= end){
       break;
     }else{
      nums[start] = nums[end];
     }
     
     while(start < end && nums[start] <= temp){//从前向后遍历，找到第一个比目标值大的数
            ++start; 
     }
     if(start >= end){
       break;
     }else{
       nums[end] = nums[start];
     }
   }
   nums[start] = temp;//把目标值插入到位置
   
   int low = start;
   QucikSort(nums, 0, low);
   QuickSort(nums, low+1, nums.length-1);
}

/*
时间复杂度：
最优情况下：O(nlogn)
最坏情况下：O(n^2)
空间复杂度
最优情况下：O(logn)
最坏情况下：O(n)
*/
