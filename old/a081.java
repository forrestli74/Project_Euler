
import java.util.Scanner;
import java.math.*;
public class a081 {
	public static void main(String[] args){
		int o=80;
		Scanner in=new Scanner(System.in).useDelimiter("\\s* ");
		int a[][]=new int[o][o];
		for(int t1=0;t1<o;t1++){
			for(int t2=0;t2<o;t2++){
				a[t1][t2]=in.nextInt();
			}
		}
		for(int t=1;t<o;t++){
			a[0][t]+=a[0][t-1];
			a[t][0]+=a[t-1][0];
		}
		
		for(int t1=1;t1<o;t1++){
			for(int t2=1;t2<o;t2++){
				a[t1][t2]+=Math.min(a[t1][t2-1],a[t1-1][t2]);
			}
		}
		for(int t1=0;t1<o;t1++){
			for(int t2=0;t2<o;t2++){
				System.out.print(a[t1][t2]+" ");
			}
			System.out.println();
		}
		System.out.println(a[o-1][o-1]);
	}
}
