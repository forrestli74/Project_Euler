
public class a231{
  public static void main(String[] args){
    int o=20000000,o2=15000000,o3=5000000,o4=1270607;
    
    boolean b[]=new boolean[o];
    long a[]=new long[o4];
    int t1=0;
    for(int t2=2;t2<o;t2++){
      if(!b[t2]){
        a[t1]=t2;
        t1++;
        for(int t3=t2*2;t3<o;t3+=t2){
          b[t3]=true;
        }
      }
    }
    long sum=0,l1,l2;
    for(t1=0;t1<o4;t1++){
      l1=a[t1];
      l2=o;
      while(l2!=0){
        l2/=l1;
        sum+=l2*a[t1];
      }
    }
    for(t1=0;t1<o4;t1++){
      l1=a[t1];
      l2=o2;
      while(l2!=0){
        l2/=l1;
        sum-=l2*a[t1];
      }
    }
    for(t1=0;t1<o4;t1++){
      l1=a[t1];
      l2=o3;
      while(l2!=0){
        l2/=l1;
        sum-=l2*a[t1];
      }
    }
    System.out.println(sum);
  }
  public static long factsum(long x){
    long l1=x,l2=2,l3,f=1;
    boolean j;
    while(l1!=1){
      j=true;
      while(j){
        if(l1%l2==0){
          j=false;
        }else{
          l2++;
        }
      }
      l3=0;
      while(l1%l2==0){
        l1/=l2;
        l3+=l2;
      }
      f+=l3;
    }
    return f;
  }
}