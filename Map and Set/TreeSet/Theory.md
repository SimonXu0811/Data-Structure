# TreeSet的数据结构
TreeSet继承与SortedSet接口，TreeSet可以确保集合的元素处于排序状态。TreeSet的底层数据结构是二叉树，保证数据唯一性的是compareTo方法

# TreeSet的特点
1. TreeSet可以支持两种排序方式，一种是自然排序，一种是定制排序，其中默认排序为自然排序
2. TreeSet的底层是一个红黑树
3. TreeSet是无序的，存储的顺序和取出的顺序不一致
4. TreeSet的值是唯一的，不允许出现重复的元素

# TreeSet的声明方式
Set<E> name = new TreeSet<>();

# TreeSet自然排序的原理
TreeSet在add的时候调用了HashMap底层的put，将需要add的对象设为key，value设为一个定值保存。接着调用compare的方法来判断添加元素的大小<br>
在第一次添加时，会将数据与本身比较，并且返回的值为0，在后面添加时都会调用conpare的方法，如果大于则返回1，并且把数据插入再原数据的right节点上；如果小于
就返回-1，并且插入到原数据的left节点上。然后再将数进行旋转，最后形成一棵二叉树。
