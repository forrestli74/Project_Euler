
import java.util.Scanner;
import java.math.*;
public class a099 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in).useDelimiter("\\s*,\\s*");
		double l,f=0;
		int l1,l2,c1=0,c2=0;
		for(int t=0;t<1000;t++){
			l1=in.nextInt();
			l2=in.nextInt();
			l=Math.log(l1)*l2;
			if(l>=f){
				f=l;
				c1=t;c2=l2;
			}
		}
		System.out.println(f+" "+c1+"^"+c2);
	}
}
