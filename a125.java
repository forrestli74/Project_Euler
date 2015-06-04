
public class a125{
  public static void main(String[] args){
    boolean j=true;
    int a=2,o=100000000;
    boolean[] data=new boolean[o];
    long[] d=new long[7100];
    d[1]=1;
    for(int t=2;t<7100;t++){
      d[t]=d[t-1]+t*t;
    }
    System.out.println(d[7099]);
    int b,l1,l2;
    long sum=0;
    while(2*a*a-2*a+1<o){
      b=a-2;
      while(b>=0&&d[a]-d[b]<o){
        if(!data[(int) (d[a]-d[b])]){
          l1=(int) (d[a]-d[b]);
          data[l1]=true;
          l2=0;
          while(l1!=0){
            l2*=10;
            l2+=l1%10;
            l1/=10;
          }
          if(l2==(int) (d[a]-d[b])){
            sum+=l2;
            System.out.println(a+" "+b+" "+(d[a]-d[b]));
          }
        }
        b--;
      }
      a++;
    }
    System.out.println(sum);
  }
}