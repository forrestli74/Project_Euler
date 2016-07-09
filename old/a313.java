
public class a313{
	static int o=1000000;
	public static void main(String[] args) {
		int[] ps=a000.primes(1000000,o);
		int t=0;
		long sum=0;
		while(ps[t]!=0){
			long lp=ps[t];
			lp*=lp;
			if(lp%8==5){
				sum++;
			}
			lp=(lp-9)/2;
			if(lp%12==3||lp%12==4||lp%12==0){
				lp+=6;
			}
			lp=(lp+6)/12;
			sum+=lp*2;
			t++;
		}
		System.out.println(sum);
	}
	
}
