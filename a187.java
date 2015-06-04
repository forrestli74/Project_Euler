
public class a187{
  public static void main(String[] args){
    int o=100000000;
    int o2=5761455;
    boolean b[]=new boolean[o];
    long a[]=new long[o2];
    int t1=0;
    for(int t2=2;t2<o;t2++){
      if(!b[t2]){
        a[t1]=t2;
        t1++;
        for(int t3=t2*2;t3<o;t3+=t2){
          b[t3]=true;
        }
      }
    }int sum=0;
    for(int t2=0;t2<o2;t2++){
      t1=0;
      while(t1<=t2&&a[t2]*a[t1]<o){
        sum++;
        //System.out.println(a[t2]*a[t1]+" "+a[t2]+" "+a[t1]);
        t1++;
      }
    }
    System.out.println(sum);
    System.out.println(a[o2-1]);
  }
}