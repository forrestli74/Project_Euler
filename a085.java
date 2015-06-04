
import java.math.*;
public class a085 {
	public static void main(String[] args){
		int a[]=new int[2827];
		for(int t=0;t<2827;t++){
			a[t]=(t+1)*(t+2)/2;
		}
		int f1=0,f2=0,fc=1000000,c;
		for(int t1=0;t1<54;t1++){
			for(int t2=53;t2<2827;t2++){
				c=Math.abs(2000000-a[t1]*a[t2]);
				if(c<fc){
					f1=t1;f2=t2;fc=c;
					System.out.println(t1+" "+t2+" cha:"+c);
				}
			}
		}
		
	}
}
