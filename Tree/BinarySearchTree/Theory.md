# BinarySearchTree的基本特征
  1. 若左子树不为空，那么左子树中所有的值比根结点的值小
  2. 若柚子树不为空，那么右子树中所有的值比跟节点的值大
  3. 没有键值相等的节点
# BinarySearchTree一般的实现功能
 1. 查找
 <pre>
 <code>
 public Tree search(Tree root, int val){
   if(root == null){
     return root;
   }
   if(val.compareTo((root.val)<0){
     search(root.left, val);
   }
   if(val.compareTo((root.val)>0){
     search(root.right, val);
   }else{
   return root;
   }
 }
 </code>
 </pre>
 <br>
 2. 最小值、最大值
 <pre>
 <code>
 //最小值就是在最左下角的元素
 public int findMin(Tree root, int val){
   if(root == null){
     return null;
   }
   while(root.left != null){
     root = root.left;
   }
   return root.val;
 }
 
 //最大值就是在最右下角的元素
 public int findMax(Tree root, int val){
   if(root == null){
    return null;
   } 
   while(root.right != null){
     root = root.right;
   }
   return root.val;
 }
 </code>
 </pre>
 <br>
 3. 插入
 <pre>
 <code>
 public void insert(Tree BSTroot, Tree newNode){
   Tree root = BSTroot.root;
   if(root == null){
     BSTroot.root = newNode;
   }
   while(root != null){
     int comp = newNode.val.compareTo(root.val);
     if(comp < 0){
       if(root.left != null){
         root = root.left
       }else{
         root.left = newNode;
       }
     }
     else if(comp > 0){
      if(root.right != null){
        root = root.right;
      }else{
        root.right = newNode;
      }
     }
   } 
 }
 </code>
 </pre>
 
 
 
 
 
 
 
