# LinkedList的声明方式
和ArrayList相似，LinkedList的声明方式就是：LinkedList<E> name = new LinkedList<>();
# LinkedList的基本特性
1. LinkedList是查询慢增删块
2. LinkedList是一个双向链表
# LinkedLisy的数据结构
 <code> 
 <pre>
       //做为双向链表，肯定一个元素包含了三个东西， 一个是对象本身，一个是指向后面的引用，一个是指向前面的引用
        public static class Node<E>{
           E item;
           Node<E> next;
           Node<E> pre;
        }
        Node(Node<E> pre, E element, Node<E> next){
          this.item = element;
          this.pre = pre;
          this.next = next;
        }
        </pre>
   </code>
   这样就构成了链表的结构。
   
# LinkedList的一些基本内置方法
   LinkedList<E> list = new LinkedList<>();<br>
   1. list.size() 返回双向链表的大小
   2. list.add(Object)/list.addLast(Object) 双向链表在队尾加入元素
   3. list.add(Object, index) 双向链表在指定处加入元素
   4. list.get(index) 返回在该索引处的对象
   5. list.remove(Object) 返回删除双向链表中的对象
   6. list.addAll(Collection<E>) 将数组插入到双向链表的末尾，返回的是？true：false
   7. list.set(index, Object)将索引处的值替换，返回的是该索引处旧的数据
# LinkedList的一些实际应用
   1. 用LinkedList构造Stack
   2. 用LinkedList构造Queue
   3. 用LinkedList构造Dequeue
   4. HashMap
   5. LinkedHashMap
