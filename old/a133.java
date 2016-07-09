public class a133{
	public static void main(String[] args) {
		int[] a = a000.primes(40000, 100000);
		long sum = 2+3;
		int t = 2;
		while(a[t]!=0){
			long aa=a[t];
			long n = f25(aa-1);
			long l=aa;
			long tt;
			for(tt=0;tt<n&&l!=0;tt++){
				l*=10;
				l+=1;
				l%=aa;
			}
			if(l!=0||tt!=f25(tt)){
				sum+=aa;
			}else{

				System.out.println(tt+" "+aa);
			}
			t++;
		}
		System.out.println(sum);
	}
	
	private static long f25(long i) {
		long tem = 1;
		while(i%2==0){
			i /= 2;
			tem *= 2;
		}
		
		while(i%5==0){
			i /= 5;
			tem *= 5;
		}
		return tem;
	}
}