
public class a075 {
	static int M=750000;
	static int P=60238;
	public static void main(String[] args){
		/*
		 * 0: nothing, prime
		 * -1: nothing,none prime
		 * 2: none prime
		 * 2:
		 */
		int[] B=new int[M];
		int[] primes=new int[P];
		int pi=0;
		int sum=0;
		for(int t1=2;t1<M;t1++){
			if(B[t1]==0){
				primes[pi++]=t1;
				for(long t2=(long)t1*t1;t2<M;t2+=t1){
					B[(int)t2]=-1;
				}
				continue;
			}
			int edge=-1;
			for(int t2=0;t2<pi;t2++){
				if(t1%primes[t2]==0){
					switch(B[t1/primes[t2]]){
						case -1:
						case 0:
							break;
						case -2:
							edge=-2;
							t2=pi;
							break;
						default:
							if(edge!=-1&&edge!=B[t1/primes[t2]]*primes[t2]){
								edge=-2;
								t2=pi;
								break;
							}
							edge=B[t1/primes[t2]]*primes[t2];
							break;
					}
				}
			}
			if(edge==-2){
				B[t1]=-2;
				continue;
			}
			int mina=(int)Math.sqrt(t1/2);
			int maxa=(int)Math.sqrt(t1-1);
			for(int t2=mina;t2<=maxa;t2++){
				int b=t1-t2*t2;
				if((b%t2==0)&&(b/t2<t2)){
					b/=t2;
					int e1=2*t2*b;
					int e2=t2*t2-b*b;
					int edge2=e1<e2?e1:e2;
					if(edge!=-1&&edge!=edge2){
						edge=-2;
						t2=maxa;
						break;
					}else{
						edge=edge2;
					}
				}
			}
			B[t1]=edge;
			if(edge>0){
				//System.out.println(t1+" "+edge);
				sum++;
				if(sum%1000==0){
					System.out.println("sum: "+t1+" "+sum);
				}
			}
		}
		System.out.println(sum);
	}
}

