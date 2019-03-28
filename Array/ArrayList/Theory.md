# ArrayList的声明方法
  ### 一维数组
  可以创建为        List<E> name = new ArrayList<>();<br>
  或者说也可以声明为 ArrayList<E> name = new ArrayList<>();<br>
  其中E代表的是数据类型的封包，比如String，Integer， Double……而不是单纯的数据类型
  ### 二维数组
  声明方式类似于一维数组List<List<E>> name = new ArrayList<>();
# ArrayList的一些特征描述
  1. ArrayList是查询块增删慢
  2. 在新增元素时，会自动的扩大数组的容量
  3. 插入一个元素时，会把新增索引出的元素全部向后移一位
  4. 删除一个元素时，会把删除后的索引以后的元素全部向前移一位（这也是为什么增删慢）
# 常见的ArrayList的内置方法(以一维为例，二维相同）
  List<E> list = new ArrayList<>();<br>
  1. list.size() 返回的就是数组的长度
  2. list.get(index) 返回的是数组在对应索引处的值
  3. list.indexOf(Object) 返回的就是数组内对象的索引
  4. list.add(Object) 返回的是将对象加到数组的最后面
  5. list.add(Object, index) 返回对象插入到数组指定的索引处
  6. list.remove(Object) 返回将数组删除指定的元素
  7. list.remove(index) 返回将数组删除指定索引处的元素
# ArrayList一些困惑
  1. 在写remove的时候就有个疑问，比如我有一个数组为{"1","1","2"}, 如果我想要删除1那么就调用list.remove("1")<br>
    但是，数组会删除所有的“1”还是第一个“1”呢?<br>
    我做了一个验证，事实证明List删除的是第一个索引到的“1”。<br>
  2. 同样是remove，我现在有一个整数数组为{2,3,4,5,1},那么我调用list.remove(1)的时候，它判断的是index还是Integer呢？<br>
    这边我也做了验证，结果是它优先选择的是索引。<br>
    到这还有困惑，是不是如果index前面没有相对应的对象，所以就删index了呢？<br>
    下面我用了另一个数组{1,3,4,5,6,1}，一样的调用了list.remove(1)<br>
    结果证明还是删除的index处的值。
