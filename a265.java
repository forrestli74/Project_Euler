
import java.math.*;
public class a265{
  public static void main(String[] args){
    long o=(long)Math.pow(2,25);
    boolean[] c;
    boolean j;
    long q1,q2,q3;
    long sum=0;
    for(int a=0;a<o;a++){
      c=new boolean[32];
      q1=a*2+1+o*2;
      q2=1;
      j=true;
      c[(int)(q1%16)*2]=true;
      c[(int)(q1%8)*4]=true;
      c[(int)(q1%4)*8]=true;
      c[(int)(q1%2)*16]=true;
      for(int t1=0;t1<28;t1++){
        q3=(q1/q2)%32;
        if(c[(int)q3]){
          j=false;
          break;
        }else{
          c[(int)q3]=true;
        }
        q2*=2;
      }
      if(j){
        sum+=q1;
        for(int t=0;t<32;t++){
          //System.out.print(q1%2);
          //q1/=2;
        }
        //System.out.println(" "+q1);
        for(int t=0;t<32;t++){
          if(!c[t]){
            j=false;
          }
        }
        if(!j){
          System.out.println("!!! "+q1);
        }
      }
    }
    System.out.println(sum);
  }
}