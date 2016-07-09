public class a132{
	public static void main(String[] args) {
		int[] a = a000.primes(100000, 2000000);
		long sum = 0;
		int count = 0;
		int t = 2;
		w:
		while(count<40){
			long aa=a[t];
			long n = f25(aa-1);
			long l=0;
			for(long tt=0;tt<n;tt++){
				l*=10;
				l+=1;
				l%=aa;
			}
			if(l==0){
				sum+=aa;
				count++;
				System.out.println(aa);
			}
			t++;
		}
		System.out.println(sum);
	}
	
	private static long f25(long i) {
		long tem = 1;
		long c=0;
		while(i%2==0&c<9){
			i /= 2;
			tem *= 2;
			c++;
		}
		c=0;
		while(i%5==0&c<9){
			i /= 5;
			tem *= 5;
			c++;
		}
		return tem;
	}
}