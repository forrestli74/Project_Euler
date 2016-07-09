


public class a140 {
	public static void main(String[] args){
		long a,b,c,d,l,sum=70;
		a=2;b=5;c=21;d=42;
		for(int t=5;t<=30;t++){
			l=7-a+7*c;
			a=b;
			b=c;
			c=d;
			d=l;
			System.out.println(t+": "+d);
			sum+=d;
		}
		System.out.println(sum);
	}
}
