

public class a197 {
	public static void main(String argb[]){
		long o=1420000000;
		long b=1000000000;
		long lim=1000000;
		double da;
		lim*=lim;
		long a=b;
		for(long t=1;t<=lim;t++){
			da=(double)a/b;
			a=(long)(o/Math.pow(2,da*da));
			if(t%1000000==0){
				System.out.println();
			}
			if(t%1000000<5){
				System.out.println(a);
			}
		}
		long sum=a;
		da=(double)a/b;
		a=(long)(o/Math.pow(2,da));
		sum+=a;
		System.out.println(sum);
	}
}
