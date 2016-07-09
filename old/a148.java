
public class a148 {
  public static void main(String[] args){
    long o=1;
    for(int t=1;t<10;t++){
      o*=10;
    }
    o=50;
    long sum=0;
    long a=o;
    long s=1;
    long l1,l2;
    for(int t=1;t<15;t++){
    	
    }
    for(int t=0;t<15;t++){
      l1=a/7;
      l2=a%7;
      sum+=l1*(l1-1)/2*21*s;
      sum+=l1*(13-l2)*l2/2*s;
      a/=7;
      s*=21;
    }
    System.out.println(sum);
  }
}