# RBT的基本概念
RBT的基本本质还是一棵二叉树，所以具有着二叉树的特点：任意节点的值都比它左子叶节点的值小，比它右子叶节点的值大

# RBT的规则
RBT具有五个规则：<br>
1. 每个节点都只能是红色或者黑色的一种
2. 跟节点是黑色的
3. 每个叶节点都是黑色的
4. 如果一个节点是红色的，那么它的两个叶子节点一定是黑色的。一条路径上不允许有两个相邻的红色节点
5. 从任意一个节点到叶子节点的所有路径中，黑色节点的个数一定相同

#RBT的数据结构
<pre>
<code>
  static final boolean RED = true;//红色的节点
  static final boolean BLACK = false;//黑色的节点
  private RBTNode root;//二叉树的根节点
  
  public class RBTNode<T extends comparable<T>>{
    boolean color;
    T val;
    RBTNode<T> left;
    RBTNode<T> right;
    RBTNode<T> parent;//红黑树的五个基本变量
  }
  
  public RBTNode(T val, RBTNode<T> left, RBTNode<T> right, RBTNode<T> parent, boolean color){//赋值
    this.val = val;
    this.left = left;
    this.right = right;
    this.parent = parent;
    this.color = color;
  }
  
  public boolean setisRED(RBTNode root){//设节点为红色
    if(root == null) return root.color == BLACK;
    return root.color == RED;
  }
</code>
</pre>

# RBT的三个基本操作
1. 旋转（左旋和右旋）
当如果出现两个相邻的红色节点时，就需要用旋转修复<br>
左旋就是把向右倾斜的树向左旋转让它重新保持平衡<br>
<pre>
<code>
  public void leftRotate(Node oldRoot){
    Node newRoot = oldRoot.right;//旧节点的右子节点设为新的节点
    oldRoot.right = newRoot.left;//旧节点的右子节点连接到新节点的左子节点
    newRoot.left.parent = oldRoot;//左子节点的父节点设为是旧节点
    ……//颜色变换等操作
  }
</code>
</pre>

右旋就是左旋的逆操作
<pre>
<code>
  public void rightRotate(Node oldRoot){
    Node newRoot = oldRoot.left;
    oldRoot.left = newRoot.right;
    newRoot.right.parent = oldRoot;
    ……
  }
</code>
</pre>

2. 
































































