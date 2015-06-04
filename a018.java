
import java.util.Scanner;
public class a018 {
	public static void main(String[] args){
		byte o=15;
		int a[][]=new int[o][o];
		Scanner in=new Scanner(System.in).useDelimiter("\\s* \\s*");
		for(int t1=0;t1<o;t1++){
			for(int t2=0;t2<=t1;t2++){
				a[t1][t2]=in.nextInt();
			}
		}
		for(int t1=o-2;t1>=0;t1--){
			for(int t2=0;t2<=t1;t2++){
				a[t1][t2]+=Math.max(a[t1+1][t2],a[t1+1][t2+1]);
			}
		}
		System.out.println(a[0][0]);
	}
}
