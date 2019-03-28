int[] temp = new int[nums.length];//创建一个临时数组，来保存排序后的数组，再复制回去
public void MergeSort(int[] nums, int start, int middle, int end){//这个用来归并两个数组
  int low = start;
  int high = middle + 1;
  int index = start;
  while(low <= high && high <= end){//如果说两个数组都有数据
    if(nums[low] >= nums[high]){//把小的那个填进临时的数组
      temp[index++] = nums[high++];
    }else{
      temp[index++] = nums[low++];
    }
  }
  
  while(low >= middle){//如果第一个排完了，那么把第二个数组填进去
     temp[index++] = nums[high++];
  }
  
  while(high >= end){//第二个排完了，那把第一个数组填进去
     temp[index++] = nums[low++];
  }
  
  for(int i = start; i <= end; i++){//最后复制回原数组
    nums[i] = temp[i];
  }
}
public void Merge(int[] nums, int start, int end){
  if(start >= end){//只有一个的时候停止
    return;
  }
  int middle = (start + end)/2;
  Merge(nums, start, middle);//数组不断一分为二
  Merge(nums, middle+1, end);
  MergeSort(nums, start, middle, end); //开始排序
}


/*
时间复杂度为：O(nlogn)
空间复杂度为：O(n)
*/
