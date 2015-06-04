

public class a070 {
	public static final int o=10000000;
	public static final int op=348513;
	public static int[] primes=a000.primes(op+1,o/2);
	public static void main(String[] args){
		int[] index=new int[op+1];
		int[] in=new int[op+1];
		for(int t=0;t<=op;t++){
			in[t]=1;
		}
		int ci=0;
		int n=1;
		tr:
		while(true){
			ci=0;
			while(ci<op&&n>o/primes[ci]){
				n/=in[ci];
				in[ci]=1;
				ci++;
			}
			if(ci>=op){
				break tr;
			}
			
			
		}
		
	}
}
