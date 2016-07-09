
public class a188{
  public static void main(String[] args){
    long a=1777,b;
    long o=10000,o2=312500;
    o*=o;
    for(int t=2;t<1855;t++){
      b=1;
      for(int tt=0;tt<a;tt++){
        b*=1777;
        b=b%o;
      }
      a=b;
      if(t%37==0){
        System.out.println(a);
      }
    }
    b=1;
    for(int t=0;t<a;t++){
      b*=1777;
      b=b%o;
    }
    System.out.println(b);
  }
}