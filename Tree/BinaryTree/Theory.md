# BinaryTree的基本介绍
树是一个非线性的数据结构，一个元素可以存在多个的对应关系，即一个父节点可以保存多个子节点。二叉树一个特殊的树，一个父节点最多只能对应两个子树，子数区分了左右节点，次序不能颠倒

# BinaryTree的构造方式
BinaryTree与线性表类似，有两种构成方式，一种是以数组的形式，还有一种是以链表的形式组成。但是基于数组的方式会出现一定的空间浪费，除非形成了完全二叉树
，所以一般二叉树都是以链表的形式构成的。

# BinaryTree的常用操作
1. 初始化
2. 为指定的节点添加子节点
3. 判断二叉树是否为空
4. 返回跟节点
5. 返回二叉树的深度
6. 遍历二叉树

# 基于数组的BinaryTree
<pre>
  <code>
   private T[] Array;
   private int deep;
   private int maxSize;
   private int size = 0;
   
   public Treedeep (int deep){
     this.deep = deep;
     maxSizev = (int)Math.pow(2,deep)-1;//根据二叉树的深度计算最大的个数
   }
   
   public void createroot(T value){//添加根节点的值
     Array[0] = value;
     size++;
   }
   
   public void add(T value, int index, boolean left){//添加树的值，根据左右节点个索引计算找
     if(Array[index] == null){//如果为空就报错
       return "null"
     }
     if(2*index + 1 >= maxSize){//如果超过最大元素个数就报错
       return "full"
     }
     if(left){//如果是左子树就加左子树的索引
       Array[2*index+1] = value;
       size++;
     }else{//否则加右子树的索引
       Array[2*index+2] = value;
       size++;
     }
     
     public boolean isEmpty(){
       return Array[0] == null;
     }
     
     public int size(int size){
       this.size = size;
     }
     
     }
   </code>
 </pre>
     
# 基于链表的BinaryTree
<pre>
  <code>
   public Node left;
   public Node right;
   public Node (T data){//初始化树
    this.data = data;
    left = null;
    right = null;
   }
  
   private root = null;
   private int size = 0;
   
   public void createroot(T value){
     if(value == null){
     return "Empty";
     }
     Node<T> node = new Node<T>(value);//创建链表来保存数据
     this.root = node;
     size++; 
   }
  
  public Node getroot(){
    if(root == null){
      return "Empty"
    }
    return this.root;
  }
  
  public boolean isEmpty(){
    return root == null;
  }
  
  public int size(){
    return size;
  }
  
  public Node add(Node<T> node, T value, boolean left){//添加
    if(value == null){
     return "Children Empty"
    }
    if(node == null){
     return "Parent Empty"
    }
    Node<T> newNode = new Node<>(value);
    if(left){
     if(node.left != null){
        return "exist"
     }
     node.left = newNode;
     size ++;
    }else{
      ……//右子树一样考虑
    }
  }
  </code>
</pre>
  
# BinaryTree的遍历
  遍历二叉树是指访问每一个节点，然后一次打印。二叉树的遍历主要有两种方式：<br>
  1. 广度优先（BFS）：依次遍历每一层
  2. 深度优先（DFS）：依次遍历最深的节点。 深度优先又有三种方式，分别是先序，中序和后序。<br>
  先序遍历就是先访问跟节点：<br>
  <br>
  <pre>
  <code>
  public List<Node> preIterator(Node root){
   List<node> list = new ArrayList<>();
   list.add(root);
   if(root.left != null){
     list.addAll(preIterator(root.left));
   }
   if(root.right != null){
     list.addAll(preIterator(root.right));
   }
   return list;
  }
  </code>
  </pre>
  <br>
  中序遍历就是先左后根再右<br>
  <pre>
  <code>
  ……
  if(root.left != null) ……
  list.add(root)
  if(root.right != null) ……
  ……
  </code>
  </pre>
  <br>
  后序遍历就是最后访问根节点
  <pre>
  <code>
  ……
  if(root.left != null)……
  if(root.right != null)……
  list.add(root)
  ……
  </code>
  </pre>
  
 
  
