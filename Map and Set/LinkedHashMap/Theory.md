# LinkedHashMap的数据结构
LinkedHashMap是LinkedList和HashMap的结合体，在保存数据时，先将数据按照HashMap的形式存放，然后又创建了before和after形成了双向链表<br>
一个HashMap的存储结构是before+hash+key+value+next+after<br>
这个结构中，hash用来计算hash值，key用来保存计算索引，value是数值，next是hashmap中自带的因为当出现碰撞时，会形成链表，在相同的位置保存数值<br>
而before和after就是LinkedHashMap中特有的，用来形成双向的链表，这样既能从前向后遍历，也能从后向前遍历
# LinkedHashMap的声明方式
LinkedHashMap是继承与HashMap的，所以它的声明方式和HashMap很类似
就是LinkedHashMap<Key,Value> name = new LinkedHashMap<>();
# LinkedHashMap的特点
这个的最大特点就是具有了双向链表的特性，它的插入和读取顺序都是一致的。而HashMap是无序的。
# LinkedHashMap的常用方式
由于LinkedHashMap是继承与HashMap的，很多的方法都是overrideHashMap中的方法，列一些比较常用的<br>
LinkedHashMap<Key,Value> linkedhashmap = new LinkedHashMap<>():<br>
1. linkedhashmap.put(Key,Value);用来存放数据，这个存放的顺序是有序的，按照存放的先后排序
2. linkedhashmap.resize();将linkedhashmap扩容，扩容大小也为2的n次幂
3. linkedhashmap.get(Key);读取linkedhashmap中的值，读取的顺序是根据存放的顺序来看的
# LinkedHashMap与LRU（Least Recently Used）算法
LinkedHashMap中，用accessOrder来表示迭代的顺序，如果accessOrder为true，那么元素会按照访问的先后顺序排序；
当accseeOrder为false时，元素按照插入的顺序排序。所以在使用LRU算法时，一定要将accessOrder设为true。
