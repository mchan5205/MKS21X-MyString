public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i ++){
      data[i] = s.charAt(i);
    }
  }
  public char charAt(int index){
    if (data.length > index && index >= 0){
      return data[index];
    }
    else{
      throw new IndexOutOfBoundsException();
    }
  }
  public int length(){
    return data.length;
  }
  public CharSequence subSequence(int start, int end){
    String y = "";
    if (start < 0 || end > data.length || start > end){
      throw new IndexOutOfBoundsException();
    }
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
    return y;
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
      if (this.charAt(i) - x.charAt(i) > 0){
        return this.charAt(i) - x.charAt(i);
      }
      if (this.charAt(i) - x.charAt(i) < 0){
        return this.charAt(i) - x.charAt(i);
      }
    }
    if (this.length() > x.length()){
      return (int) this.charAt(x.length());
    }
    if (x.length() > this.length()){
      return (int) x.charAt(this.length());
    }
    return 0;
  }
}
