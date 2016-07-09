
import java.util.Scanner;
public class a108b {
	public static void main(String[] args){
		int oo=100;
		Scanner scanner=new Scanner(System.in);
		long[] save=new long[oo];
		long o=scanner.nextLong();
		for(int t=0;t<oo;t++){
			save[t]=o;
		}
		long a=o,f=0,max=0;
		while(f<4000000){
			f=c(a);
			if(max<f){
				max=f;
				for(int tt=0;tt<oo-1;tt++){
					save[tt]=save[tt+1];
				}
				save[oo-1]=max;
				o=save[0];
				System.out.println(a+" "+f);
			}
			a+=o;
		}
		System.out.println((a-o)+" "+f);
	}
	public static long c(long a){
		long l1,l2,t,f;
		l1=a;
		t=2;
		f=1;
		while(l1!=1){
			if(l1%t==0){
				l2=0;
				while(l1%t==0){
					l2++;
					l1/=t;
				}
				f*=(l2*2+1);
			}
			t++;
		}
		return f/2+1;
	}
}
