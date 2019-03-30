# HashMap的数据结构
HashMap实际上就是数组和指针的结合体，也称之为链表散列。<br>
HashMap就是一个数组结构，当初始一个HashMap时，就会初始一个数组。<br>
以底层代码表示HashMap的初始结构<br>
<pre>
  <code>
    static class Entry<K,V> implements Map.Entry<K,V>{
       final key;//hashmap中的指针
       V value;//hashmap中的数组的值
       final int hash;//哈希值
       Entry<K,V> next;//只想下一层的引用
       ……
    }
  </code>
</pre>
在哈希put的过程中，会根据key的hash值找到对应的数组的索引，然后把value放到相应的位置，如果这个位置上已经有数组了，那么会在相应的位置上以链表的形式存放，新的放在链头，旧的放在链尾。<br>
在get的过程中，首先计算出key的哈希值，并且找到相应的索引，然后通过equal的形式在链表中找到相应的值。

# Hash算法
计算key的hash值就是运用的hash算法，算法的作用就是使value分布的均匀一些，尽量让数组的链表只有一个值，就不需要再去遍历链表，这样get的效率能达到最高。通过推算可以的值，当数组为2的n次幂的时候，不同key计算出的哈希值相同的几率最小。所以在大容量计算时，最好初始hashmap的size为2的n次幂。<br>
hash算法为 h & (length-1)

# HashMap的扩容
hash需要存放的值足够大的时候，这时候就需要扩容，公式是size * 0.75 > num。 size还要取2的n次幂。 以1000为例，要找到2^n * 0.75 > 1000, 那么size的值为2048最为合适了。 

# HashMap与ArrayMap的区别
ArrayMap是用了两个数组模拟HashMap，一个数组用来存放hash值，第二个数组把key和value连续的放在数组中。然后通过计算hash值得到对应的索引，再根据这个索引去查找第二个数组中的Key和Value。

# HashMap的声明方式
 HashMap<Key, Value> hashmap = new HashMap<>():
 
# HashMap的常用操作
 HashMap<Key, Value> hashmap = new HashMap<>();
 1. hashmap.put(Key, Value);根据key找索引，把value插入，如果value已经存在，则覆盖
 2. hashmap.containsKey(Key);判断是否存在key？true：false
 3. hashmap.containsValue(Value);判断是否存在Value？true：false
 4. hashmap.get(Key);通过key来取值
 5. hashmap.isEmpty();判断是否为空？true：false
 6. hashmap.size();返回hashmap的大小
 7. hashmap.remove(Key);通过key来删除值
 
# HashMap的时空复杂度
一般情况下，hashmap的插入和查找时间复杂度都为O(1)
 
 
 
 
 
 

