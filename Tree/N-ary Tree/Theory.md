# N-ary Tree的数据结构
N-ary Tree的数据结构和二叉树类似，只是它的子节点变成了一个数组，一个父节点可以含有多个子节点

# N-ary Tree的生成
<pre>
<code>
  public class N-aryTree(){
   private TreeNode parent;
   private T val;
   private List<TreeNode> children = new ArrayList<>();
  }
</code>
</pre>

# N-ary Tree的递归遍历
<pre>
<code>
  public void Recursion(TreeNode root){
    System.out.print(root.val);
    for(TreeNode treenode : root.children){
      Recursion(treenode);
    }
  }
</code>
</pre>

# N-ary Tree的广度优先遍历
<pre>
<code>
  public void BFS(TreeNode root){
    Deque<TreeNode> deque = new LinkedList<>();
    TreeNode node = root;
    deque.push(node);
    while(!deque.isEmpty()){
      node = deque.pop();
      System.out.print(node.val);
      for(TreeNode tree: node.children){
        deque.addLast(tree);
      }
    }
  }
</code>
</pre>

# N-ary Tree的深度优先遍历
<pre>
<code>
  public void DFS(TreeNode root){
   Deque<TreeNode> deque = new LinkedList<>();
   TreeNode node = root;
   deque.push(node);
   while(!deque.isEmpty()){
     node = deque.pop();
     System.out.print(node.val)
     for(TreeNode tree : node.children){
       deque.push(tree);
     }
   }
 }
</code>
</pre>
 
 
 
