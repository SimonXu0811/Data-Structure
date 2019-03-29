# PriorityQueue的思想
  PriorityQueue的数据结构就是一棵完全二叉树，储存的结构是一个数组<br>
  PriorityQueue与普通的queue相同，也具有队头和队尾，但是元素是按自然顺序排序的，比如整数按大小，字符串按字典顺序排序
# PriorityQueue的特性
  1. 只允许插入能够进行比较的对象
  2. 不能够插入null
  3. PriorityQueue默认为一个小顶堆
# PriorityQueue的声明方式
  Queue<E> name = new PriorityQueue();
# PriorityQueue的常用方法
  Queue<E> prique = new PriorityQueue();
  1. prique.add(Object);插入元素，如果插入成功返回true
  2. prique.peek();返回根节点元素，不删除
  3. prique.poll();删除根节点元素，返回被删除的元素
  4. prique.remove(Object);删除对应的元素，如果有重复的删除第一个，成功返回true
  5. prique.contains(Object);查询是否有对象元素？true:false
# PriorityQueue的时间复杂度分析
  1. remove()和add()的方法，时间复杂度为:O(logn)
  2. remove(Object)和contains(Object)的方法，时间复杂度为:O(n)
  3. 取队头的时间复杂度为:O(1)
