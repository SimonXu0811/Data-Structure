# Stack的声明方式
  Stack的声明方式其实有三种：<br>
  1. 用内置方法申明：Stack<E> name = new Stack<>();
  2. 用ArrayList来构造Stack
  3. 用LinkedList来构造Stack
# Stack的基本特性
  Stack采用的是后进先出的方式（LIFO）
# Stack的常用内置方法
  Stack<E> stack = new Stack<>();
  1. stack.push(Object);将对象压入栈，置于栈的顶端
  2. stack.peek();返回栈最顶端的对象
  3. stack.pop();删除栈最顶端的对象，并且返回删除的元素
  4. stack.isEmpty();判断栈是否为空？true：false
  5. stack.getLength();返回栈的长度
# 时间复杂度分析
  ### 线性栈
      push():   O(1)
      pop():    O(1)
      peek():   O(1)
      isEmpty():O(1)
  ### 链式栈
      push():   O(1)
      pop():    O(1)
      peek():   O(1)
      isEmpty():O(1)
# 空间复杂度分析
  ### 线性栈
      N次的压入栈中:O(n)
  ### 链式栈
      N次的压入栈中:O(n)
# 借助ArrayList创建Stack
  <pre>
   <code>
    private ArrayList<E> list = new ArrayList<>();
    
    public boolean isEmpty(){
      return list.isEmpty()?true:flase;
    }
    
    public void push(Object){//插入到数组的最后端
      list.add(Object);
    }
    
    public Object pop(){//根据后进先出，把最后的元素删除
      Object o = null;
      if(!isEmpty()){
        o = list.get(list.size()-1);
        list.remove(o);
        return o;
      }else{
        return null;
      }
    }
    
    public Object peek(){//取最后的元素
      Object o = null;
      if(!isEmpty()){
        o = list.get(list.size()-1);
        return o;
      }else{
        return null;
      }
    }
    
    public int getLength(){
      return list.length;
    }
   </code>
  </pre>
 # 用LinkedList创建Stack
   <pre>
    <code>
      private LinkedList<E> linkedlist = new LinkedList<>();
      
      public boolean isEmpty(){
        linkedlist.isEmpty();
      }
      
      public void push(Object){
        linkedlist.addFirst(Object);
      }
      
      public Object peek(){
        linkedlist.getFirst();
      }
      
      public Object pop(){
        return linkedlist.removeFirst();
      }
      
      public int getLength(){
        return linkedlist.size();
      }
    </code>
   </pre>
 # Stack的应用
   1. 匹配通用括号
   2. 计算多项式
