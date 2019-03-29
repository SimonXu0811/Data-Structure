public boolean CheckBracket (String s){
  Stack<Character> stack = new Stack<>();
  Char[] ch = s.toCharArray();
  switch(char c : ch){//先将括号开始的左半边压入栈中
    case '(':
    case '[':
    case ')':
     stack.push(c);
     break;
  }
  switch(char c1 : ch){//判断到了右半边，立马看栈里面最上的元素是否匹配
    case ')':
      if(stack.pop() != '('){
        return false;
      }
      break;
    case ']':
      if(stack.pop() != ']'){
        return false;
      }
      break;
    case '}':
      if(stack.pop() != '}'){
        return false;
      }
      break;
   }
   return true;//如果全匹配那么就是true，有一个不匹配就是false
}
