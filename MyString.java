public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[];
    for (int i = 0; i < s.length(); i ++){
      data[i] = s.charAt(i);
    }
  }
  public char charAt(int index){
    return data[index];
  }
  public int length(){
    return data.length;
  }
  public CharSequence subSequence(int start, int end){
    String y = "";
    for (int i = start; i < end; i ++){
      y += data[i];
    }
    MyString x = new MyString(y);
    return x;
  }
  public String toString(){
    String y = "";
    for (int i = 0; i < data.length; i ++){
      y += data[i];
    }
  }
  public int compareTo(CharSequence x){
    int length;
    if (this.length() > x.length()){
      length = x.length();
    }
    else{
      length = this.length();
    }
    for (int i = 0; i < length; i ++){
      if (this.charAt(i) > x.charAt(i)){
        return 1;
      }
      if (this.charAt(i) > x.charAt(i)){
        return -1;
      }
    }
    return 0;
  }
}
