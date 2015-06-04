
public class a004{
  public static void main(String[] args){
    byte a[]=new byte[3];
    long c;
    long f=0;
    boolean lim=false;
    a[2]=1;
    for(long t=0;t<10000&&lim==false;t++){
     c=read6(a);
     if(c>f&&test(c)==true){
       f=c;
     }
     c=read5(a);
     if(c>f&&test(c)==true){
       f=c;
     }
     a[0]++;
     for(byte tt=0;tt<2;tt++){
       if(a[tt]==10){
         a[tt]=0;
         a[tt+1]++;
       }
     }
     if(a[2]==10){
       lim=true;
     }
    }
    System.out.println(f);
  }
  public static long read6(byte a[]){
    long f=0;
    f+=100001*a[0];
    f+=10010*a[1];
    f+=1100*a[2];
    return f;
  }
  public static long read5(byte a[]){
    long f=0;
    f+=10001*a[0];
    f+=1010*a[1];
    f+=100*a[2];
    return f;
  }
  public static boolean test(long c){
    boolean f=false;
    int count=0;
    long l=(long) Math.sqrt((double)c);
    int t=100;
    do{
      if(c%t==0&&c/t<1000){
        count++;
      }
      t++;
    }while(t<=l);
    if(count==1){
      f=true;
    }
    return f;
  }
}