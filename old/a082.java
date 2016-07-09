
import java.util.Scanner;
import java.math.*;
public class a082 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in).useDelimiter("\\s* ");
		int o=80;
		int a[][]=new int[o][o+1];
		int b[][]=new int[o][o+1];
		int c1,c2;
		for(int t1=0;t1<o;t1++){
			for(int t2=0;t2<o;t2++){
				a[t1][t2]=in.nextInt();
				b[t1][t2]=a[t1][t2];
				System.out.print(a[t1][t2]+"\t");
			}
			System.out.println();
		}
		
		for(int t1=1;t1<=o;t1++){
			for(int t2=0;t2<o;t2++){
				c1=a[t2][t1-1];
				c2=0;
				for(int t3=t2-1;t3>=0;t3--){
					c2+=a[t3][t1];
					c1=Math.min(c1,c2+a[t3][t1-1]);
				}
				c2=0;
				for(int t3=t2+1;t3<o;t3++){
					c2+=a[t3][t1];
					c1=Math.min(c1,c2+a[t3][t1-1]);
				}
				b[t2][t1]+=c1;
			}
			for(int t2=0;t2<o;t2++){
				a[t2][t1]=b[t2][t1];
			}
		}
		
		System.out.println(a[0][o]);
	}
}
