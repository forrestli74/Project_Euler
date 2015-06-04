
public class a003{
  public static void main(String[] args){
    long o=60085;
    int f=0,t=2;
    o*=10000000;
    o+=1475143;
    long l=(long) Math.sqrt((double)o);
    do{
      if(o%t==0){
        o/=t;
        f=t;
      }else{
        t++;
      }
    }while(t<l);
    System.out.println(f);
  }
}