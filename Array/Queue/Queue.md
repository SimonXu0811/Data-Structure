# Queue的声明方式
  Queue的声明也有三种方式：<br>
  1. 用内置方法声明：Queue<E> name = new LinkedList<>();
  2. 用ArrayList创建Queue
  3. 用LinkedList创建Queue
# Queue的特性
  Queue采用的是先进先出的原则(FIFO)
# Queue的一些内置方法
  Queue<E> que = new LinkedList<>();
  1. que.add(Object);将对象添加进队列里成功返回true,如果que已满就会报错
  2. que.offer(Object);将对象添加进队列里成功返回true，如果que已满返回false ——> 最优选
  3. que.remove();删除最前端的对象，如果que为空就会报错
  4. que.poll();删除最前端的对象，如果que为空，那么返回null ——> 最优选
  5. que.element();返回que中的队首元素，如果que为空就会报错
  6. que.peek();返回que中的队首元素，如果que为空，那么返回null ——> 最优选
# 用LinkedList创建Queue
  <pre>
   <code>
     private LinkedList<E> linkedlist = new LinkedList<>();
     private int capacity;
     
     public boolean isEmpty(){
       return linkedlist.isEmpty();
     }
     
     public void offer(Object){//如果满了返回null，否则加到队尾
       if(linkedlist.size()>=capacity){
         return null;
       }else{
         linkedlist.addLast(Object);
       }
     }
     
     public Object poll(){//数组为空就返回null，否则删除队首
       if(linkedlist.isEmpty()){
         return null;
       }else{
         return linkedlist.removeFirst();
       }
     }
     
     public Object peek(){//数组为空返回null，否则取队首的数
       if(linkedlist.isEmpty()){
         return null;
       }else{
         return linkedlist.getFirst();
       }
     }
   </code>
  </pre>
