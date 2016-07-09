
public class a073{
  public static void main(String[] args){
    int t1=1,t2,sum=0;
    while(t1*2+1<=12000){
      t2=1;
      while(t2<t1&&t1*2+t2<=12000){
        if(fa(t1,t2)){
          sum++;
        }
        t2++;
      }
      t1++;
    }
    System.out.println(sum);
  }
  public static boolean fa(int t1,int t2){
    int l=t2;
    while(l!=0){
      l=t1%t2;
      t1=t2;
      t2=l;
    }
    if(t1==1){
      return true;
    }else{
      return false;
    }
  }
}