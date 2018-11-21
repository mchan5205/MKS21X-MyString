public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[];
    for (int i = 0; i < s.length(); i ++){
      data[i] = s.subSequence(i, i + 1);
    }
  }
}
