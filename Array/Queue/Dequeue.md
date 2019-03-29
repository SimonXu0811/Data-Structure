# Dequeue与Queue之间的不同
  Dequeue的优势就在于，它可以双向的添加和删除
# 将Dequeue用作Queue
  |Queue|等效Dequeue|
  |:--|:--|
  |add(Object)|addLast(Object)|
  |offer(Object)|offerLast(Object)|
  |remove()|removeFirst()|
  |poll()|pollFirst()|
  |element()|getFirst()|
  |peek()|peekFirst()|
  与queue同样的，Dequeue在删除和增加的时候会对应的产生报错和返回特殊值
# 将Dequeue用作Stack
  |Stack|等效Dequeue|
  |:--|:--|
  |push(Object)|addFirst(Object)|
  |pop()|removeFirst()|
  |peek()|getFirst()|
# Dequeue的声明方式
  |Stack|常用的增删方法|Queue|常用的增删方法|
  |:--|:--|:--|:--|
  |Deque <<E>E> name = new ArrayDeque<>();| |Deque <<E>E> name = new LinkedList<>()| |
  |常用的增加方法|push()|常用的增加方法|add()|
  |常用的删除方法|pop()|常用的删除方法|remove()|
