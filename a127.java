

public class a127 {
	static int[] primes;
	public static void main(String[] args){
		int o=10000,c2,sum=0;
		primes=a000.primes(11301, 120000);
		//System.out.println(primes[0]);
		for(int c=1;c<o;c++){
			c2=c/2;
			for(int a=1;a<c2;a++){
				if(a000.GCD(a,c)==1&&a000.GCD(a,c-a)==1&&c((long) a*c*(c-a))<c){
					sum+=c;
				}
			}
			if(c%2000==0){
				System.out.println(c/2000);
			}
		}
		System.out.println(sum);
	}
	public static long c(long a){
		long l1,l2,f;
		int t;
		l1=a;
		t=0;
		f=1;
		while(l1!=1){
			if(l1%primes[t]==0){
				l2=0;
				while(l1%primes[t]==0){
					l2++;
					l1/=primes[t];
				}
				f*=primes[t];
			}
			t++;
		}
		return f;
	}
}
