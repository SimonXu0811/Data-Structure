# HashSet的数据结构
hashset实现的是set的接口，但是在底层还是利用的hashmap的数据结构，采用hashmap来保存数据。
# HashSet的特性
 1. HashSet的无序的
 2. HashSet允许null值的出现
 3. HashSet不允许添加相同的值
# HashSet的声明方式
  HashSet<E> name = new HashSet<>()
  
# HashSet的常用方法
  HashSet<E> hashset = new HashSet<>()
  1. hashset.size();返回hashset的元素个数
  2. hashset.isEmpty();返回hashset是否为空？true：false
  3. hashset.contains(Object);返回hashset中是否存在该对象？true：false
  4. hashset.add(Object);添加元素进hashset中，不允许出现相同的值
  5. hashset.remove(Object);把hashset中的元素删除
  6. hashset.clear();把hashset中元素清空
  
# HashSet的Add()
HashSet是将HashMap中的链表移除了，在添加的过程中，调用了HashMap的put方法。当添加时，set会调用e.equals()的方法，如果要保存的key值已经存在，value将会覆盖，并且返回true。所以不会将相同的value放进hashmap中，这也就是HashSet不允许添加相同值的原因，只有当e.equals()返回false的时候，value才会被保存到hashmap中

